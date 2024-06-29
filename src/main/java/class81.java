import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class81 extends class240 {

    @OriginalMember(owner = "client!in", name = "v", descriptor = "I")
    private int field1272;

    @OriginalMember(owner = "client!in", name = "z", descriptor = "I")
    private int field1276;

    @OriginalMember(owner = "client!in", name = "y", descriptor = "Z")
    private boolean field1275;

    @OriginalMember(owner = "client!in", name = "A", descriptor = "I")
    private int field1277;

    @OriginalMember(owner = "client!in", name = "q", descriptor = "I")
    private int field1267;

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    private int field1264;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "I")
    private int field1266;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    private int field1265;

    @OriginalMember(owner = "client!in", name = "r", descriptor = "I")
    private int field1268;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    private int field1269;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    private int field1270;

    @OriginalMember(owner = "client!in", name = "u", descriptor = "I")
    private int field1271;

    @OriginalMember(owner = "client!in", name = "w", descriptor = "I")
    private int field1273;

    @OriginalMember(owner = "client!in", name = "x", descriptor = "I")
    private int field1274;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II[B[IIIIIIIIIILin;II)I", line = 3)
    private static final int method638(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class81 arg13, int arg14, int arg15) {
        arg13.field1268 -= arg13.field1274 * arg5;
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
        arg13.field1268 += arg13.field1274 * var22;
        arg13.field1270 = arg6;
        arg13.field1265 = arg7;
        arg13.field1266 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V", line = 48)
    public final synchronized void method639(int arg0) {
        int var2 = ((class241) super.field3370).field3374.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1266 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II[B[IIIIIIIILin;II)I", line = 58)
    private static final int method640(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
        arg11.field1270 -= arg11.field1269 * arg5;
        arg11.field1265 -= arg11.field1263 * arg5;
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
        arg11.field1270 += arg11.field1269 * arg5;
        arg11.field1265 += arg11.field1263 * arg5;
        arg11.field1268 = arg6;
        arg11.field1266 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lfc;II)Lin;", line = 91)
    public static final class81 method641(class241 arg0, int arg1, int arg2) {
        return arg0.field3374 != null && arg0.field3374.length != 0 ? new class81(arg0, (int) ((long) arg0.field3377 * 256L * (long) arg1 / (long) (class443.field6071 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V", line = 97)
    private final synchronized void method642(int arg0) {
        this.method669(arg0, this.method662());
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V", line = 100)
    public final synchronized void method643(boolean arg0) {
        this.field1277 = (this.field1277 >>> 31) + (this.field1277 ^ this.field1277 >> 31);
        if (arg0) {
            this.field1277 = -this.field1277;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([IIIII)I", line = 106)
    private final int method644(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1273 <= 0) {
                if (this.field1277 == -256 && (this.field1266 & 255) == 0) {
                    if (class79.field1234) {
                        return method677(0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, 0, arg3, arg2, this);
                    }
                    return method659(((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, 0, arg3, arg2, this);
                }
                if (class79.field1234) {
                    return method675(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, 0, arg3, arg2, this, this.field1277, arg4);
                }
                return method664(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, 0, arg3, arg2, this, this.field1277, arg4);
            }
            int var6 = this.field1273 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1273 += arg1;
            if (this.field1277 == -256 && (this.field1266 & 255) == 0) {
                if (class79.field1234) {
                    arg1 = method656(0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, this.field1269, this.field1263, 0, var6, arg2, this);
                } else {
                    arg1 = method663(((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, this.field1274, 0, var6, arg2, this);
                }
            } else if (class79.field1234) {
                arg1 = method670(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, this.field1269, this.field1263, 0, var6, arg2, this, this.field1277, arg4);
            } else {
                arg1 = method673(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, this.field1274, 0, var6, arg2, this, this.field1277, arg4);
            }
            this.field1273 -= arg1;
            if (this.field1273 != 0) {
                return arg1;
            }
        } while (!this.method671());
        return arg3;
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "()Z", line = 161)
    public final boolean method645() {
        return this.field1273 != 0;
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "()V", line = 166)
    private final void method646() {
        if (this.field1273 != 0) {
            if (this.field1267 == Integer.MIN_VALUE) {
                this.field1267 = 0;
            }
            this.field1273 = 0;
            this.method678();
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V", line = 179)
    public final synchronized void method647(int arg0) {
        if (arg0 == 0) {
            this.method642(0);
            this.method2797(-109);
        } else if (this.field1270 == 0 && this.field1265 == 0) {
            this.field1273 = 0;
            this.field1267 = 0;
            this.field1268 = 0;
            this.method2797(-111);
        } else {
            int var2 = -this.field1268;
            if (this.field1268 > var2) {
                var2 = this.field1268;
            }
            if (-this.field1270 > var2) {
                var2 = -this.field1270;
            }
            if (this.field1270 > var2) {
                var2 = this.field1270;
            }
            if (-this.field1265 > var2) {
                var2 = -this.field1265;
            }
            if (this.field1265 > var2) {
                var2 = this.field1265;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1273 = arg0;
            this.field1267 = Integer.MIN_VALUE;
            this.field1274 = -this.field1268 / arg0;
            this.field1269 = -this.field1270 / arg0;
            this.field1263 = -this.field1265 / arg0;
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "([IIIII)I", line = 224)
    private final int method648(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1273 <= 0) {
                if (this.field1277 == 256 && (this.field1266 & 255) == 0) {
                    if (class79.field1234) {
                        return method652(0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, 0, arg3, arg2, this);
                    }
                    return method676(((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, 0, arg3, arg2, this);
                }
                if (class79.field1234) {
                    return method661(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, 0, arg3, arg2, this, this.field1277, arg4);
                }
                return method653(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, 0, arg3, arg2, this, this.field1277, arg4);
            }
            int var6 = this.field1273 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1273 += arg1;
            if (this.field1277 == 256 && (this.field1266 & 255) == 0) {
                if (class79.field1234) {
                    arg1 = method658(0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, this.field1269, this.field1263, 0, var6, arg2, this);
                } else {
                    arg1 = method674(((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, this.field1274, 0, var6, arg2, this);
                }
            } else if (class79.field1234) {
                arg1 = method638(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1270, this.field1265, this.field1269, this.field1263, 0, var6, arg2, this, this.field1277, arg4);
            } else {
                arg1 = method640(0, 0, ((class241) super.field3370).field3374, arg0, this.field1266, arg1, this.field1268, this.field1274, 0, var6, arg2, this, this.field1277, arg4);
            }
            this.field1273 -= arg1;
            if (this.field1273 != 0) {
                return arg1;
            }
        } while (!this.method671());
        return arg3;
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V", line = 281)
    public final synchronized void method649(int arg0) {
        if (this.field1277 < 0) {
            this.field1277 = -arg0;
        } else {
            this.field1277 = arg0;
        }
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "(I)V", line = 289)
    public final synchronized void method650(int arg0) {
        this.field1271 = arg0;
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "()Z", line = 292)
    public final boolean method651() {
        return this.field1266 < 0 || this.field1266 >= ((class241) super.field3370).field3374.length << 8;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[B[IIIIIIIILin;)I", line = 297)
    private static final int method652(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10) {
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
        arg10.field1266 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II[B[IIIIIIILin;II)I", line = 335)
    private static final int method653(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10, int arg11, int arg12) {
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
        arg10.field1266 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)I", line = 365)
    private static final int method654(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!in", name = "i", descriptor = "(I)V", line = 368)
    public final synchronized void method655(int arg0) {
        this.method669(arg0 << 6, this.method662());
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I[B[IIIIIIIIIILin;)I", line = 371)
    private static final int method656(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class81 arg12) {
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
        arg12.field1268 += (var19 - arg4) * arg12.field1274;
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
        arg12.field1270 = var15 >> 2;
        arg12.field1265 = var16 >> 2;
        arg12.field1266 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lfc;III)Lin;", line = 426)
    public static final class81 method657(class241 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3374 != null && arg0.field3374.length != 0 ? new class81(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I[B[IIIIIIIIIILin;)I", line = 432)
    private static final int method658(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class81 arg12) {
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
        arg12.field1268 += (var19 - arg4) * arg12.field1274;
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
        arg12.field1270 = var15 >> 2;
        arg12.field1265 = var16 >> 2;
        arg12.field1266 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "()Lsda;", line = 485)
    public final class240 method165() {
        return null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([B[IIIIIIILin;)I", line = 488)
    private static final int method659(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8) {
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
        arg8.field1266 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "([III)V", line = 514)
    public final synchronized void method160(int[] arg0, int arg1, int arg2) {
        if (this.field1267 == 0 && this.field1273 == 0) {
            this.method162(arg2);
        } else {
            class241 var4 = (class241) super.field3370;
            int var5 = this.field1272 << 8;
            int var6 = this.field1276 << 8;
            int var7 = var4.field3374.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1271 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1266 < 0) {
                if (this.field1277 <= 0) {
                    this.method646();
                    this.method2797(-118);
                    return;
                }
                this.field1266 = 0;
            }
            if (this.field1266 >= var7) {
                if (this.field1277 >= 0) {
                    this.method646();
                    this.method2797(86);
                    return;
                }
                this.field1266 = var7 - 1;
            }
            if (this.field1271 < 0) {
                if (this.field1275) {
                    if (this.field1277 < 0) {
                        var9 = this.method644(arg0, arg1, var5, var10, var4.field3374[this.field1272]);
                        if (this.field1266 >= var5) {
                            return;
                        }
                        this.field1266 = var5 + var5 - 1 - this.field1266;
                        this.field1277 = -this.field1277;
                    }
                    while (true) {
                        int var11 = this.method648(arg0, var9, var6, var10, var4.field3374[this.field1276 - 1]);
                        if (this.field1266 < var6) {
                            return;
                        }
                        this.field1266 = var6 + var6 - 1 - this.field1266;
                        this.field1277 = -this.field1277;
                        var9 = this.method644(arg0, var11, var5, var10, var4.field3374[this.field1272]);
                        if (this.field1266 >= var5) {
                            return;
                        }
                        this.field1266 = var5 + var5 - 1 - this.field1266;
                        this.field1277 = -this.field1277;
                    }
                } else if (this.field1277 < 0) {
                    while (true) {
                        var9 = this.method644(arg0, var9, var5, var10, var4.field3374[this.field1276 - 1]);
                        if (this.field1266 >= var5) {
                            return;
                        }
                        this.field1266 = var6 - 1 - (var6 - 1 - this.field1266) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method648(arg0, var9, var6, var10, var4.field3374[this.field1272]);
                        if (this.field1266 < var6) {
                            return;
                        }
                        this.field1266 = (this.field1266 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1271 > 0) {
                    if (this.field1275) {
                        label130: {
                            if (this.field1277 < 0) {
                                var9 = this.method644(arg0, arg1, var5, var10, var4.field3374[this.field1272]);
                                if (this.field1266 >= var5) {
                                    return;
                                }
                                this.field1266 = var5 + var5 - 1 - this.field1266;
                                this.field1277 = -this.field1277;
                                if (--this.field1271 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method648(arg0, var9, var6, var10, var4.field3374[this.field1276 - 1]);
                                if (this.field1266 < var6) {
                                    return;
                                }
                                this.field1266 = var6 + var6 - 1 - this.field1266;
                                this.field1277 = -this.field1277;
                                if (--this.field1271 == 0) {
                                    break;
                                }
                                var9 = this.method644(arg0, var9, var5, var10, var4.field3374[this.field1272]);
                                if (this.field1266 >= var5) {
                                    return;
                                }
                                this.field1266 = var5 + var5 - 1 - this.field1266;
                                this.field1277 = -this.field1277;
                            } while (--this.field1271 != 0);
                        }
                    } else if (this.field1277 < 0) {
                        while (true) {
                            var9 = this.method644(arg0, var9, var5, var10, var4.field3374[this.field1276 - 1]);
                            if (this.field1266 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1266) / var8;
                            if (var12 >= this.field1271) {
                                this.field1266 += this.field1271 * var8;
                                this.field1271 = 0;
                                break;
                            }
                            this.field1266 += var8 * var12;
                            this.field1271 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method648(arg0, var9, var6, var10, var4.field3374[this.field1272]);
                            if (this.field1266 < var6) {
                                return;
                            }
                            int var13 = (this.field1266 - var5) / var8;
                            if (var13 >= this.field1271) {
                                this.field1266 -= this.field1271 * var8;
                                this.field1271 = 0;
                                break;
                            }
                            this.field1266 -= var8 * var13;
                            this.field1271 -= var13;
                        }
                    }
                }
                if (this.field1277 < 0) {
                    this.method644(arg0, var9, 0, var10, 0);
                    if (this.field1266 < 0) {
                        this.field1266 = -1;
                        this.method646();
                        this.method2797(-124);
                        return;
                    }
                } else {
                    this.method648(arg0, var9, var7, var10, 0);
                    if (this.field1266 >= var7) {
                        this.field1266 = var7;
                        this.method646();
                        this.method2797(-101);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "()I", line = 752)
    public final int method660() {
        int var1 = this.field1268 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1271 == 0) {
            var2 -= this.field1266 * var2 / (((class241) super.field3370).field3374.length << 8);
        } else if (this.field1271 >= 0) {
            var2 -= this.field1272 * var2 / ((class241) super.field3370).field3374.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II[B[IIIIIIIILin;II)I", line = 765)
    private static final int method661(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
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
        arg11.field1266 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!in", name = "h", descriptor = "()I", line = 798)
    public final synchronized int method662() {
        return this.field1264 < 0 ? -1 : this.field1264;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "([B[IIIIIIIILin;)I", line = 802)
    private static final int method663(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class81 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1270 += (var14 - arg3) * arg9.field1269;
        arg9.field1265 += (var14 - arg3) * arg9.field1263;
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
        arg9.field1268 = var12 >> 2;
        arg9.field1266 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II[B[IIIIIIILin;II)I", line = 836)
    private static final int method664(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10, int arg11, int arg12) {
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
        arg10.field1266 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V", line = 862)
    public final synchronized void method665(int arg0, int arg1) {
        this.method668(arg0, arg1, this.method662());
    }

    @OriginalMember(owner = "client!in", name = "i", descriptor = "()I", line = 865)
    public final synchronized int method666() {
        return this.field1267 == Integer.MIN_VALUE ? 0 : this.field1267;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II)I", line = 868)
    private static final int method667(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)V", line = 873)
    public final synchronized void method668(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method669(arg1, arg2);
        } else {
            int var4 = method667(arg1, arg2);
            int var5 = method654(arg1, arg2);
            if (this.field1270 == var4 && this.field1265 == var5) {
                this.field1273 = 0;
            } else {
                int var6 = arg1 - this.field1268;
                if (this.field1268 - arg1 > var6) {
                    var6 = this.field1268 - arg1;
                }
                if (var4 - this.field1270 > var6) {
                    var6 = var4 - this.field1270;
                }
                if (this.field1270 - var4 > var6) {
                    var6 = this.field1270 - var4;
                }
                if (var5 - this.field1265 > var6) {
                    var6 = var5 - this.field1265;
                }
                if (this.field1265 - var5 > var6) {
                    var6 = this.field1265 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1273 = arg0;
                this.field1267 = arg1;
                this.field1264 = arg2;
                this.field1274 = (arg1 - this.field1268) / arg0;
                this.field1269 = (var4 - this.field1270) / arg0;
                this.field1263 = (var5 - this.field1265) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(II)V", line = 919)
    private final synchronized void method669(int arg0, int arg1) {
        this.field1267 = arg0;
        this.field1264 = arg1;
        this.field1273 = 0;
        this.method678();
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II[B[IIIIIIIIIILin;II)I", line = 925)
    private static final int method670(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class81 arg13, int arg14, int arg15) {
        arg13.field1268 -= arg13.field1274 * arg5;
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
        arg13.field1268 += arg13.field1274 * var22;
        arg13.field1270 = arg6;
        arg13.field1265 = arg7;
        arg13.field1266 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!in", name = "j", descriptor = "()Z", line = 969)
    private final boolean method671() {
        int var1 = this.field1267;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method667(var1, this.field1264);
            var2 = method654(var1, this.field1264);
        }
        if (this.field1268 == var1 && this.field1270 == var3 && this.field1265 == var2) {
            if (this.field1267 == Integer.MIN_VALUE) {
                this.field1267 = 0;
                this.field1268 = this.field1270 = this.field1265 = 0;
                this.method2797(-122);
                return true;
            } else {
                this.method678();
                return false;
            }
        } else {
            if (this.field1268 < var1) {
                this.field1274 = 1;
                this.field1273 = var1 - this.field1268;
            } else if (this.field1268 > var1) {
                this.field1274 = -1;
                this.field1273 = this.field1268 - var1;
            } else {
                this.field1274 = 0;
            }
            if (this.field1270 < var3) {
                this.field1269 = 1;
                if (this.field1273 == 0 || this.field1273 > var3 - this.field1270) {
                    this.field1273 = var3 - this.field1270;
                }
            } else if (this.field1270 > var3) {
                this.field1269 = -1;
                if (this.field1273 == 0 || this.field1273 > this.field1270 - var3) {
                    this.field1273 = this.field1270 - var3;
                }
            } else {
                this.field1269 = 0;
            }
            if (this.field1265 < var2) {
                this.field1263 = 1;
                if (this.field1273 == 0 || this.field1273 > var2 - this.field1265) {
                    this.field1273 = var2 - this.field1265;
                }
            } else if (this.field1265 > var2) {
                this.field1263 = -1;
                if (this.field1273 == 0 || this.field1273 > this.field1265 - var2) {
                    this.field1273 = this.field1265 - var2;
                }
            } else {
                this.field1263 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!in", name = "k", descriptor = "()I", line = 1054)
    public final synchronized int method672() {
        return this.field1277 < 0 ? -this.field1277 : this.field1277;
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(II[B[IIIIIIIILin;II)I", line = 1057)
    private static final int method673(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
        arg11.field1270 -= arg11.field1269 * arg5;
        arg11.field1265 -= arg11.field1263 * arg5;
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
        arg11.field1270 += arg11.field1269 * arg5;
        arg11.field1265 += arg11.field1263 * arg5;
        arg11.field1268 = arg6;
        arg11.field1266 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V", line = 1090)
    public final synchronized void method162(int arg0) {
        if (this.field1273 > 0) {
            if (arg0 >= this.field1273) {
                if (this.field1267 == Integer.MIN_VALUE) {
                    this.field1267 = 0;
                    this.field1268 = this.field1270 = this.field1265 = 0;
                    this.method2797(72);
                    arg0 = this.field1273;
                }
                this.field1273 = 0;
                this.method678();
            } else {
                this.field1268 += this.field1274 * arg0;
                this.field1270 += this.field1269 * arg0;
                this.field1265 += this.field1263 * arg0;
                this.field1273 -= arg0;
            }
        }
        class241 var2 = (class241) super.field3370;
        int var3 = this.field1272 << 8;
        int var4 = this.field1276 << 8;
        int var5 = var2.field3374.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1271 = 0;
        }
        if (this.field1266 < 0) {
            if (this.field1277 <= 0) {
                this.method646();
                this.method2797(-116);
                return;
            }
            this.field1266 = 0;
        }
        if (this.field1266 >= var5) {
            if (this.field1277 >= 0) {
                this.method646();
                this.method2797(107);
                return;
            }
            this.field1266 = var5 - 1;
        }
        this.field1266 += this.field1277 * arg0;
        if (this.field1271 < 0) {
            if (!this.field1275) {
                if (this.field1277 < 0) {
                    if (this.field1266 < var3) {
                        this.field1266 = var4 - 1 - (var4 - 1 - this.field1266) % var6;
                    }
                } else if (this.field1266 >= var4) {
                    this.field1266 = (this.field1266 - var3) % var6 + var3;
                }
            } else {
                if (this.field1277 < 0) {
                    if (this.field1266 >= var3) {
                        return;
                    }
                    this.field1266 = var3 + var3 - 1 - this.field1266;
                    this.field1277 = -this.field1277;
                }
                while (this.field1266 >= var4) {
                    this.field1266 = var4 + var4 - 1 - this.field1266;
                    this.field1277 = -this.field1277;
                    if (this.field1266 >= var3) {
                        return;
                    }
                    this.field1266 = var3 + var3 - 1 - this.field1266;
                    this.field1277 = -this.field1277;
                }
            }
        } else {
            if (this.field1271 > 0) {
                if (this.field1275) {
                    label125: {
                        if (this.field1277 < 0) {
                            if (this.field1266 >= var3) {
                                return;
                            }
                            this.field1266 = var3 + var3 - 1 - this.field1266;
                            this.field1277 = -this.field1277;
                            if (--this.field1271 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1266 < var4) {
                                return;
                            }
                            this.field1266 = var4 + var4 - 1 - this.field1266;
                            this.field1277 = -this.field1277;
                            if (--this.field1271 == 0) {
                                break;
                            }
                            if (this.field1266 >= var3) {
                                return;
                            }
                            this.field1266 = var3 + var3 - 1 - this.field1266;
                            this.field1277 = -this.field1277;
                        } while (--this.field1271 != 0);
                    }
                } else if (this.field1277 < 0) {
                    if (this.field1266 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1266) / var6;
                    if (var7 < this.field1271) {
                        this.field1266 += var6 * var7;
                        this.field1271 -= var7;
                        return;
                    }
                    this.field1266 += this.field1271 * var6;
                    this.field1271 = 0;
                } else {
                    if (this.field1266 < var4) {
                        return;
                    }
                    int var8 = (this.field1266 - var3) / var6;
                    if (var8 < this.field1271) {
                        this.field1266 -= var6 * var8;
                        this.field1271 -= var8;
                        return;
                    }
                    this.field1266 -= this.field1271 * var6;
                    this.field1271 = 0;
                }
            }
            if (this.field1277 < 0) {
                if (this.field1266 < 0) {
                    this.field1266 = -1;
                    this.method646();
                    this.method2797(-118);
                    return;
                }
            } else if (this.field1266 >= var5) {
                this.field1266 = var5;
                this.method646();
                this.method2797(116);
            }
        }
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "([B[IIIIIIIILin;)I", line = 1311)
    private static final int method674(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class81 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1270 += (var14 - arg3) * arg9.field1269;
        arg9.field1265 += (var14 - arg3) * arg9.field1263;
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
        arg9.field1268 = var12 >> 2;
        arg9.field1266 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!in", name = "d", descriptor = "(II[B[IIIIIIIILin;II)I", line = 1345)
    private static final int method675(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
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
        arg11.field1266 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "([B[IIIIIIILin;)I", line = 1378)
    private static final int method676(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8) {
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
        arg8.field1266 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I[B[IIIIIIIILin;)I", line = 1403)
    private static final int method677(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10) {
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
        arg10.field1266 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "()Lsda;", line = 1442)
    public final class240 method156() {
        return null;
    }

    @OriginalMember(owner = "client!in", name = "l", descriptor = "()V", line = 1446)
    private final void method678() {
        this.field1268 = this.field1267;
        this.field1270 = method667(this.field1267, this.field1264);
        this.field1265 = method654(this.field1267, this.field1264);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "()I", line = 1452)
    public final int method163() {
        return this.field1267 == 0 && this.field1273 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lfc;II)V", line = 1458)
    private class81(class241 arg0, int arg1, int arg2) {
        super.field3370 = arg0;
        this.field1272 = arg0.field3376;
        this.field1276 = arg0.field3378;
        this.field1275 = arg0.field3375;
        this.field1277 = arg1;
        this.field1267 = arg2;
        this.field1264 = 8192;
        this.field1266 = 0;
        this.method678();
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "(Lfc;III)V", line = 1469)
    private class81(class241 arg0, int arg1, int arg2, int arg3) {
        super.field3370 = arg0;
        this.field1272 = arg0.field3376;
        this.field1276 = arg0.field3378;
        this.field1275 = arg0.field3375;
        this.field1277 = arg1;
        this.field1267 = arg2;
        this.field1264 = arg3;
        this.field1266 = 0;
        this.method678();
    }
}
