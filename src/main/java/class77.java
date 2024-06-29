import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class77 extends class184 {

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "I")
    private int field1403;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    private int field1400;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "Z")
    private boolean field1408;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "I")
    private int field1404;

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "I")
    private int field1397;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    private int field1398;

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "I")
    private int field1399;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    private int field1401;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    private int field1409;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([B[IIIIIIIILph;)I")
    private static final int method549(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class77 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1402 += (var14 - arg3) * arg9.field1409;
        arg9.field1401 += (var14 - arg3) * arg9.field1399;
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
        arg9.field1398 = var12 >> 2;
        arg9.field1406 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B[IIIIIIIILph;)I")
    private static final int method550(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10) {
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
        arg10.field1406 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([IIIII)I")
    private final int method551(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1407 <= 0) {
                if (this.field1411 == -256 && (this.field1406 & 255) == 0) {
                    if (class286.field5020) {
                        return method562(0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, 0, arg3, arg2, this);
                    }
                    return method582(((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, 0, arg3, arg2, this);
                }
                if (class286.field5020) {
                    return method558(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, 0, arg3, arg2, this, this.field1411, arg4);
                }
                return method570(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, 0, arg3, arg2, this, this.field1411, arg4);
            }
            int var6 = this.field1407 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1407 += arg1;
            if (this.field1411 == -256 && (this.field1406 & 255) == 0) {
                if (class286.field5020) {
                    arg1 = method565(0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, this.field1409, this.field1399, 0, var6, arg2, this);
                } else {
                    arg1 = method549(((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, this.field1405, 0, var6, arg2, this);
                }
            } else if (class286.field5020) {
                arg1 = method557(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, this.field1409, this.field1399, 0, var6, arg2, this, this.field1411, arg4);
            } else {
                arg1 = method580(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, this.field1405, 0, var6, arg2, this, this.field1411, arg4);
            }
            this.field1407 -= arg1;
            if (this.field1407 != 0) {
                return arg1;
            }
        } while (!this.method553());
        return arg3;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II[B[IIIIIIIIIILph;II)I")
    private static final int method552(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class77 arg13, int arg14, int arg15) {
        arg13.field1398 -= arg13.field1405 * arg5;
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
        arg13.field1398 += arg13.field1405 * var22;
        arg13.field1402 = arg6;
        arg13.field1401 = arg7;
        arg13.field1406 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "()Z")
    private final boolean method553() {
        int var1 = this.field1404;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method577(var1, this.field1397);
            var2 = method572(var1, this.field1397);
        }
        if (this.field1398 == var1 && this.field1402 == var3 && this.field1401 == var2) {
            if (this.field1404 == Integer.MIN_VALUE) {
                this.field1404 = 0;
                this.field1398 = this.field1402 = this.field1401 = 0;
                this.method1346((byte) -16);
                return true;
            } else {
                this.method587();
                return false;
            }
        } else {
            if (this.field1398 < var1) {
                this.field1405 = 1;
                this.field1407 = var1 - this.field1398;
            } else if (this.field1398 > var1) {
                this.field1405 = -1;
                this.field1407 = this.field1398 - var1;
            } else {
                this.field1405 = 0;
            }
            if (this.field1402 < var3) {
                this.field1409 = 1;
                if (this.field1407 == 0 || this.field1407 > var3 - this.field1402) {
                    this.field1407 = var3 - this.field1402;
                }
            } else if (this.field1402 > var3) {
                this.field1409 = -1;
                if (this.field1407 == 0 || this.field1407 > this.field1402 - var3) {
                    this.field1407 = this.field1402 - var3;
                }
            } else {
                this.field1409 = 0;
            }
            if (this.field1401 < var2) {
                this.field1399 = 1;
                if (this.field1407 == 0 || this.field1407 > var2 - this.field1401) {
                    this.field1407 = var2 - this.field1401;
                }
            } else if (this.field1401 > var2) {
                this.field1399 = -1;
                if (this.field1407 == 0 || this.field1407 > this.field1401 - var2) {
                    this.field1407 = this.field1401 - var2;
                }
            } else {
                this.field1399 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)V")
    public final synchronized void method554(int arg0) {
        this.method573(arg0 << 6, this.method556());
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "()I")
    public final synchronized int method555() {
        return this.field1411 < 0 ? -this.field1411 : this.field1411;
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "()I")
    public final synchronized int method556() {
        return this.field1397 < 0 ? -1 : this.field1397;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II[B[IIIIIIIIIILph;II)I")
    private static final int method557(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class77 arg13, int arg14, int arg15) {
        arg13.field1398 -= arg13.field1405 * arg5;
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
        arg13.field1398 += arg13.field1405 * var22;
        arg13.field1402 = arg6;
        arg13.field1401 = arg7;
        arg13.field1406 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II[B[IIIIIIIILph;II)I")
    private static final int method558(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
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
        arg11.field1406 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(I)V")
    public final synchronized void method559(int arg0) {
        this.field1410 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(Z)V")
    public final synchronized void method560(boolean arg0) {
        this.field1411 = (this.field1411 >>> 31) + (this.field1411 ^ this.field1411 >> 31);
        if (arg0) {
            this.field1411 = -this.field1411;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lme;III)Lph;")
    public static final class77 method561(class222 arg0, int arg1, int arg2, int arg3) {
        return arg0.field4070 != null && arg0.field4070.length != 0 ? new class77(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I[B[IIIIIIIILph;)I")
    private static final int method562(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10) {
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
        arg10.field1406 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "()I")
    public final synchronized int method563() {
        return this.field1404 == Integer.MIN_VALUE ? 0 : this.field1404;
    }

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "(I)V")
    public final synchronized void method564(int arg0) {
        if (this.field1411 < 0) {
            this.field1411 = -arg0;
        } else {
            this.field1411 = arg0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B[IIIIIIIIIILph;)I")
    private static final int method565(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class77 arg12) {
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
        arg12.field1398 += (var19 - arg4) * arg12.field1405;
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
        arg12.field1402 = var15 >> 2;
        arg12.field1401 = var16 >> 2;
        arg12.field1406 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "()Z")
    public final boolean method566() {
        return this.field1406 < 0 || this.field1406 >= ((class222) super.field3273).field4070.length << 8;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II[B[IIIIIIIILph;II)I")
    private static final int method567(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
        arg11.field1402 -= arg11.field1409 * arg5;
        arg11.field1401 -= arg11.field1399 * arg5;
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
        arg11.field1402 += arg11.field1409 * arg5;
        arg11.field1401 += arg11.field1399 * arg5;
        arg11.field1398 = arg6;
        arg11.field1406 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "([III)V")
    public final synchronized void method191(int[] arg0, int arg1, int arg2) {
        if (this.field1404 == 0 && this.field1407 == 0) {
            this.method203(arg2);
        } else {
            class222 var4 = (class222) super.field3273;
            int var5 = this.field1403 << 8;
            int var6 = this.field1400 << 8;
            int var7 = var4.field4070.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1410 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1406 < 0) {
                if (this.field1411 <= 0) {
                    this.method584();
                    this.method1346((byte) -16);
                    return;
                }
                this.field1406 = 0;
            }
            if (this.field1406 >= var7) {
                if (this.field1411 >= 0) {
                    this.method584();
                    this.method1346((byte) -16);
                    return;
                }
                this.field1406 = var7 - 1;
            }
            if (this.field1410 < 0) {
                if (this.field1408) {
                    if (this.field1411 < 0) {
                        var9 = this.method551(arg0, arg1, var5, var10, var4.field4070[this.field1403]);
                        if (this.field1406 >= var5) {
                            return;
                        }
                        this.field1406 = var5 + var5 - 1 - this.field1406;
                        this.field1411 = -this.field1411;
                    }
                    while (true) {
                        int var11 = this.method586(arg0, var9, var6, var10, var4.field4070[this.field1400 - 1]);
                        if (this.field1406 < var6) {
                            return;
                        }
                        this.field1406 = var6 + var6 - 1 - this.field1406;
                        this.field1411 = -this.field1411;
                        var9 = this.method551(arg0, var11, var5, var10, var4.field4070[this.field1403]);
                        if (this.field1406 >= var5) {
                            return;
                        }
                        this.field1406 = var5 + var5 - 1 - this.field1406;
                        this.field1411 = -this.field1411;
                    }
                } else if (this.field1411 < 0) {
                    while (true) {
                        var9 = this.method551(arg0, var9, var5, var10, var4.field4070[this.field1400 - 1]);
                        if (this.field1406 >= var5) {
                            return;
                        }
                        this.field1406 = var6 - 1 - (var6 - 1 - this.field1406) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method586(arg0, var9, var6, var10, var4.field4070[this.field1403]);
                        if (this.field1406 < var6) {
                            return;
                        }
                        this.field1406 = (this.field1406 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1410 > 0) {
                    if (this.field1408) {
                        label130: {
                            if (this.field1411 < 0) {
                                var9 = this.method551(arg0, arg1, var5, var10, var4.field4070[this.field1403]);
                                if (this.field1406 >= var5) {
                                    return;
                                }
                                this.field1406 = var5 + var5 - 1 - this.field1406;
                                this.field1411 = -this.field1411;
                                if (--this.field1410 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method586(arg0, var9, var6, var10, var4.field4070[this.field1400 - 1]);
                                if (this.field1406 < var6) {
                                    return;
                                }
                                this.field1406 = var6 + var6 - 1 - this.field1406;
                                this.field1411 = -this.field1411;
                                if (--this.field1410 == 0) {
                                    break;
                                }
                                var9 = this.method551(arg0, var9, var5, var10, var4.field4070[this.field1403]);
                                if (this.field1406 >= var5) {
                                    return;
                                }
                                this.field1406 = var5 + var5 - 1 - this.field1406;
                                this.field1411 = -this.field1411;
                            } while (--this.field1410 != 0);
                        }
                    } else if (this.field1411 < 0) {
                        while (true) {
                            var9 = this.method551(arg0, var9, var5, var10, var4.field4070[this.field1400 - 1]);
                            if (this.field1406 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1406) / var8;
                            if (var12 >= this.field1410) {
                                this.field1406 += this.field1410 * var8;
                                this.field1410 = 0;
                                break;
                            }
                            this.field1406 += var8 * var12;
                            this.field1410 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method586(arg0, var9, var6, var10, var4.field4070[this.field1403]);
                            if (this.field1406 < var6) {
                                return;
                            }
                            int var13 = (this.field1406 - var5) / var8;
                            if (var13 >= this.field1410) {
                                this.field1406 -= this.field1410 * var8;
                                this.field1410 = 0;
                                break;
                            }
                            this.field1406 -= var8 * var13;
                            this.field1410 -= var13;
                        }
                    }
                }
                if (this.field1411 < 0) {
                    this.method551(arg0, var9, 0, var10, 0);
                    if (this.field1406 < 0) {
                        this.field1406 = -1;
                        this.method584();
                        this.method1346((byte) -16);
                        return;
                    }
                } else {
                    this.method586(arg0, var9, var7, var10, 0);
                    if (this.field1406 >= var7) {
                        this.field1406 = var7;
                        this.method584();
                        this.method1346((byte) -16);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)V")
    public final synchronized void method568(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method573(arg1, arg2);
        } else {
            int var4 = method577(arg1, arg2);
            int var5 = method572(arg1, arg2);
            if (this.field1402 == var4 && this.field1401 == var5) {
                this.field1407 = 0;
            } else {
                int var6 = arg1 - this.field1398;
                if (this.field1398 - arg1 > var6) {
                    var6 = this.field1398 - arg1;
                }
                if (var4 - this.field1402 > var6) {
                    var6 = var4 - this.field1402;
                }
                if (this.field1402 - var4 > var6) {
                    var6 = this.field1402 - var4;
                }
                if (var5 - this.field1401 > var6) {
                    var6 = var5 - this.field1401;
                }
                if (this.field1401 - var5 > var6) {
                    var6 = this.field1401 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1407 = arg0;
                this.field1404 = arg1;
                this.field1397 = arg2;
                this.field1405 = (arg1 - this.field1398) / arg0;
                this.field1409 = (var4 - this.field1402) / arg0;
                this.field1399 = (var5 - this.field1401) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "()Z")
    public final boolean method569() {
        return this.field1407 != 0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II[B[IIIIIIILph;II)I")
    private static final int method570(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10, int arg11, int arg12) {
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
        arg10.field1406 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V")
    private final synchronized void method571(int arg0) {
        this.method573(arg0, this.method556());
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)I")
    private static final int method572(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)V")
    private final synchronized void method573(int arg0, int arg1) {
        this.field1404 = arg0;
        this.field1397 = arg1;
        this.field1407 = 0;
        this.method587();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([B[IIIIIIILph;)I")
    private static final int method574(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class77 arg8) {
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
        arg8.field1406 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "(I)V")
    public final synchronized void method575(int arg0) {
        if (arg0 == 0) {
            this.method571(0);
            this.method1346((byte) -16);
        } else if (this.field1402 == 0 && this.field1401 == 0) {
            this.field1407 = 0;
            this.field1404 = 0;
            this.field1398 = 0;
            this.method1346((byte) -16);
        } else {
            int var2 = -this.field1398;
            if (this.field1398 > var2) {
                var2 = this.field1398;
            }
            if (-this.field1402 > var2) {
                var2 = -this.field1402;
            }
            if (this.field1402 > var2) {
                var2 = this.field1402;
            }
            if (-this.field1401 > var2) {
                var2 = -this.field1401;
            }
            if (this.field1401 > var2) {
                var2 = this.field1401;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1407 = arg0;
            this.field1404 = Integer.MIN_VALUE;
            this.field1405 = -this.field1398 / arg0;
            this.field1409 = -this.field1402 / arg0;
            this.field1399 = -this.field1401 / arg0;
        }
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II[B[IIIIIIIILph;II)I")
    private static final int method576(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
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
        arg11.field1406 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(II)I")
    private static final int method577(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "()I")
    public final int method187() {
        return this.field1404 == 0 && this.field1407 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V")
    public final synchronized void method203(int arg0) {
        if (this.field1407 > 0) {
            if (arg0 >= this.field1407) {
                if (this.field1404 == Integer.MIN_VALUE) {
                    this.field1404 = 0;
                    this.field1398 = this.field1402 = this.field1401 = 0;
                    this.method1346((byte) -16);
                    arg0 = this.field1407;
                }
                this.field1407 = 0;
                this.method587();
            } else {
                this.field1398 += this.field1405 * arg0;
                this.field1402 += this.field1409 * arg0;
                this.field1401 += this.field1399 * arg0;
                this.field1407 -= arg0;
            }
        }
        class222 var2 = (class222) super.field3273;
        int var3 = this.field1403 << 8;
        int var4 = this.field1400 << 8;
        int var5 = var2.field4070.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1410 = 0;
        }
        if (this.field1406 < 0) {
            if (this.field1411 <= 0) {
                this.method584();
                this.method1346((byte) -16);
                return;
            }
            this.field1406 = 0;
        }
        if (this.field1406 >= var5) {
            if (this.field1411 >= 0) {
                this.method584();
                this.method1346((byte) -16);
                return;
            }
            this.field1406 = var5 - 1;
        }
        this.field1406 += this.field1411 * arg0;
        if (this.field1410 < 0) {
            if (!this.field1408) {
                if (this.field1411 < 0) {
                    if (this.field1406 < var3) {
                        this.field1406 = var4 - 1 - (var4 - 1 - this.field1406) % var6;
                    }
                } else if (this.field1406 >= var4) {
                    this.field1406 = (this.field1406 - var3) % var6 + var3;
                }
            } else {
                if (this.field1411 < 0) {
                    if (this.field1406 >= var3) {
                        return;
                    }
                    this.field1406 = var3 + var3 - 1 - this.field1406;
                    this.field1411 = -this.field1411;
                }
                while (this.field1406 >= var4) {
                    this.field1406 = var4 + var4 - 1 - this.field1406;
                    this.field1411 = -this.field1411;
                    if (this.field1406 >= var3) {
                        return;
                    }
                    this.field1406 = var3 + var3 - 1 - this.field1406;
                    this.field1411 = -this.field1411;
                }
            }
        } else {
            if (this.field1410 > 0) {
                if (this.field1408) {
                    label125: {
                        if (this.field1411 < 0) {
                            if (this.field1406 >= var3) {
                                return;
                            }
                            this.field1406 = var3 + var3 - 1 - this.field1406;
                            this.field1411 = -this.field1411;
                            if (--this.field1410 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1406 < var4) {
                                return;
                            }
                            this.field1406 = var4 + var4 - 1 - this.field1406;
                            this.field1411 = -this.field1411;
                            if (--this.field1410 == 0) {
                                break;
                            }
                            if (this.field1406 >= var3) {
                                return;
                            }
                            this.field1406 = var3 + var3 - 1 - this.field1406;
                            this.field1411 = -this.field1411;
                        } while (--this.field1410 != 0);
                    }
                } else if (this.field1411 < 0) {
                    if (this.field1406 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1406) / var6;
                    if (var7 < this.field1410) {
                        this.field1406 += var6 * var7;
                        this.field1410 -= var7;
                        return;
                    }
                    this.field1406 += this.field1410 * var6;
                    this.field1410 = 0;
                } else {
                    if (this.field1406 < var4) {
                        return;
                    }
                    int var8 = (this.field1406 - var3) / var6;
                    if (var8 < this.field1410) {
                        this.field1406 -= var6 * var8;
                        this.field1410 -= var8;
                        return;
                    }
                    this.field1406 -= this.field1410 * var6;
                    this.field1410 = 0;
                }
            }
            if (this.field1411 < 0) {
                if (this.field1406 < 0) {
                    this.field1406 = -1;
                    this.method584();
                    this.method1346((byte) -16);
                    return;
                }
            } else if (this.field1406 >= var5) {
                this.field1406 = var5;
                this.method584();
                this.method1346((byte) -16);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "([B[IIIIIIIILph;)I")
    private static final int method578(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class77 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1402 += (var14 - arg3) * arg9.field1409;
        arg9.field1401 += (var14 - arg3) * arg9.field1399;
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
        arg9.field1398 = var12 >> 2;
        arg9.field1406 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "()I")
    public final int method579() {
        int var1 = this.field1398 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1410 == 0) {
            var2 -= this.field1406 * var2 / (((class222) super.field3273).field4070.length << 8);
        } else if (this.field1410 >= 0) {
            var2 -= this.field1403 * var2 / ((class222) super.field3273).field4070.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(II[B[IIIIIIIILph;II)I")
    private static final int method580(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class77 arg11, int arg12, int arg13) {
        arg11.field1402 -= arg11.field1409 * arg5;
        arg11.field1401 -= arg11.field1399 * arg5;
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
        arg11.field1402 += arg11.field1409 * arg5;
        arg11.field1401 += arg11.field1399 * arg5;
        arg11.field1398 = arg6;
        arg11.field1406 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "(I)V")
    public final synchronized void method581(int arg0) {
        int var2 = ((class222) super.field3273).field4070.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1406 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "([B[IIIIIIILph;)I")
    private static final int method582(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class77 arg8) {
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
        arg8.field1406 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II[B[IIIIIIILph;II)I")
    private static final int method583(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class77 arg10, int arg11, int arg12) {
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
        arg10.field1406 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "()V")
    private final void method584() {
        if (this.field1407 != 0) {
            if (this.field1404 == Integer.MIN_VALUE) {
                this.field1404 = 0;
            }
            this.field1407 = 0;
            this.method587();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lme;II)Lph;")
    public static final class77 method585(class222 arg0, int arg1, int arg2) {
        return arg0.field4070 != null && arg0.field4070.length != 0 ? new class77(arg0, (int) ((long) arg0.field4072 * 256L * (long) arg1 / (long) (class275.field4822 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "()Lda;")
    public final class184 method210() {
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "([IIIII)I")
    private final int method586(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1407 <= 0) {
                if (this.field1411 == 256 && (this.field1406 & 255) == 0) {
                    if (class286.field5020) {
                        return method550(0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, 0, arg3, arg2, this);
                    }
                    return method574(((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, 0, arg3, arg2, this);
                }
                if (class286.field5020) {
                    return method576(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, 0, arg3, arg2, this, this.field1411, arg4);
                }
                return method583(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, 0, arg3, arg2, this, this.field1411, arg4);
            }
            int var6 = this.field1407 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1407 += arg1;
            if (this.field1411 == 256 && (this.field1406 & 255) == 0) {
                if (class286.field5020) {
                    arg1 = method589(0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, this.field1409, this.field1399, 0, var6, arg2, this);
                } else {
                    arg1 = method578(((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, this.field1405, 0, var6, arg2, this);
                }
            } else if (class286.field5020) {
                arg1 = method552(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1402, this.field1401, this.field1409, this.field1399, 0, var6, arg2, this, this.field1411, arg4);
            } else {
                arg1 = method567(0, 0, ((class222) super.field3273).field4070, arg0, this.field1406, arg1, this.field1398, this.field1405, 0, var6, arg2, this, this.field1411, arg4);
            }
            this.field1407 -= arg1;
            if (this.field1407 != 0) {
                return arg1;
            }
        } while (!this.method553());
        return arg3;
    }

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "()V")
    private final void method587() {
        this.field1398 = this.field1404;
        this.field1402 = method577(this.field1404, this.field1397);
        this.field1401 = method572(this.field1404, this.field1397);
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(II)V")
    public final synchronized void method588(int arg0, int arg1) {
        this.method568(arg0, arg1, this.method556());
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "()Lda;")
    public final class184 method196() {
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I[B[IIIIIIIIIILph;)I")
    private static final int method589(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class77 arg12) {
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
        arg12.field1398 += (var19 - arg4) * arg12.field1405;
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
        arg12.field1402 = var15 >> 2;
        arg12.field1401 = var16 >> 2;
        arg12.field1406 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lme;II)V")
    private class77(class222 arg0, int arg1, int arg2) {
        super.field3273 = arg0;
        this.field1403 = arg0.field4074;
        this.field1400 = arg0.field4073;
        this.field1408 = arg0.field4071;
        this.field1411 = arg1;
        this.field1404 = arg2;
        this.field1397 = 8192;
        this.field1406 = 0;
        this.method587();
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Lme;III)V")
    private class77(class222 arg0, int arg1, int arg2, int arg3) {
        super.field3273 = arg0;
        this.field1403 = arg0.field4074;
        this.field1400 = arg0.field4073;
        this.field1408 = arg0.field4071;
        this.field1411 = arg1;
        this.field1404 = arg2;
        this.field1397 = arg3;
        this.field1406 = 0;
        this.method587();
    }
}
