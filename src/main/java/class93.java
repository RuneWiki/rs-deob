import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class93 extends class659 {

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    private int field1410;

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    private int field1408;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "Z")
    private boolean field1409;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    private int field1412;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
    private int field1415;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
    private int field1419;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    private int field1411;

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "I")
    private int field1405;

    @OriginalMember(owner = "client!lca", name = "m", descriptor = "I")
    private int field1406;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "I")
    private int field1407;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    private int field1413;

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    private int field1414;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    private int field1416;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "I")
    private int field1417;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
    private int field1418;

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(III)V", line = 3)
    public final synchronized void method513(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method530(arg1, arg2);
        } else {
            int var4 = method532(arg1, arg2);
            int var5 = method518(arg1, arg2);
            if (this.field1405 == var4 && this.field1416 == var5) {
                this.field1417 = 0;
            } else {
                int var6 = arg1 - this.field1406;
                if (this.field1406 - arg1 > var6) {
                    var6 = this.field1406 - arg1;
                }
                if (var4 - this.field1405 > var6) {
                    var6 = var4 - this.field1405;
                }
                if (this.field1405 - var4 > var6) {
                    var6 = this.field1405 - var4;
                }
                if (var5 - this.field1416 > var6) {
                    var6 = var5 - this.field1416;
                }
                if (this.field1416 - var5 > var6) {
                    var6 = this.field1416 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1417 = arg0;
                this.field1415 = arg1;
                this.field1419 = arg2;
                this.field1414 = (arg1 - this.field1406) / arg0;
                this.field1418 = (var4 - this.field1405) / arg0;
                this.field1407 = (var5 - this.field1416) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II[B[IIIIIIIIIILlca;II)I", line = 49)
    private static final int method514(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13, int arg14, int arg15) {
        arg13.field1406 -= arg13.field1414 * arg5;
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
        arg13.field1406 += arg13.field1414 * var22;
        arg13.field1405 = arg6;
        arg13.field1416 = arg7;
        arg13.field1411 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II[B[IIIIIIIILlca;II)I", line = 92)
    private static final int method515(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
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
        arg11.field1411 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "([IIIII)I", line = 127)
    private final int method516(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1417 <= 0) {
                if (this.field1412 == 256 && (this.field1411 & 255) == 0) {
                    if (class550.field8108) {
                        return method544(0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, 0, arg3, arg2, this);
                    }
                    return method533(((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, 0, arg3, arg2, this);
                }
                if (class550.field8108) {
                    return method546(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, 0, arg3, arg2, this, this.field1412, arg4);
                }
                return method527(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, 0, arg3, arg2, this, this.field1412, arg4);
            }
            int var6 = this.field1417 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1417 += arg1;
            if (this.field1412 == 256 && (this.field1411 & 255) == 0) {
                if (class550.field8108) {
                    arg1 = method552(0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, this.field1418, this.field1407, 0, var6, arg2, this);
                } else {
                    arg1 = method554(((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, this.field1414, 0, var6, arg2, this);
                }
            } else if (class550.field8108) {
                arg1 = method514(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, this.field1418, this.field1407, 0, var6, arg2, this, this.field1412, arg4);
            } else {
                arg1 = method524(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, this.field1414, 0, var6, arg2, this, this.field1412, arg4);
            }
            this.field1417 -= arg1;
            if (this.field1417 != 0) {
                return arg1;
            }
        } while (!this.method522());
        return arg3;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 183)
    public final synchronized void method517(int arg0) {
        if (this.field1412 < 0) {
            this.field1412 = -arg0;
        } else {
            this.field1412 = arg0;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II)I", line = 190)
    private static final int method518(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Z)V", line = 193)
    public final synchronized void method519(boolean arg0) {
        this.field1412 = (this.field1412 >>> 31) + (this.field1412 ^ this.field1412 >> 31);
        if (arg0) {
            this.field1412 = -this.field1412;
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I[B[IIIIIIIILlca;)I", line = 199)
    private static final int method520(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10) {
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
        arg10.field1411 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "()Z", line = 239)
    public final boolean method521() {
        return this.field1417 != 0;
    }

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "()Z", line = 245)
    private final boolean method522() {
        int var1 = this.field1415;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method532(var1, this.field1419);
            var2 = method518(var1, this.field1419);
        }
        if (this.field1406 == var1 && this.field1405 == var3 && this.field1416 == var2) {
            if (this.field1415 == Integer.MIN_VALUE) {
                this.field1415 = 0;
                this.field1406 = this.field1405 = this.field1416 = 0;
                this.method2360((byte) 66);
                return true;
            } else {
                this.method542();
                return false;
            }
        } else {
            if (this.field1406 < var1) {
                this.field1414 = 1;
                this.field1417 = var1 - this.field1406;
            } else if (this.field1406 > var1) {
                this.field1414 = -1;
                this.field1417 = this.field1406 - var1;
            } else {
                this.field1414 = 0;
            }
            if (this.field1405 < var3) {
                this.field1418 = 1;
                if (this.field1417 == 0 || this.field1417 > var3 - this.field1405) {
                    this.field1417 = var3 - this.field1405;
                }
            } else if (this.field1405 > var3) {
                this.field1418 = -1;
                if (this.field1417 == 0 || this.field1417 > this.field1405 - var3) {
                    this.field1417 = this.field1405 - var3;
                }
            } else {
                this.field1418 = 0;
            }
            if (this.field1416 < var2) {
                this.field1407 = 1;
                if (this.field1417 == 0 || this.field1417 > var2 - this.field1416) {
                    this.field1417 = var2 - this.field1416;
                }
            } else if (this.field1416 > var2) {
                this.field1407 = -1;
                if (this.field1417 == 0 || this.field1417 > this.field1416 - var2) {
                    this.field1417 = this.field1416 - var2;
                }
            } else {
                this.field1407 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "()I", line = 330)
    public final synchronized int method523() {
        return this.field1412 < 0 ? -this.field1412 : this.field1412;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(II[B[IIIIIIIILlca;II)I", line = 334)
    private static final int method524(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
        arg11.field1405 -= arg11.field1418 * arg5;
        arg11.field1416 -= arg11.field1407 * arg5;
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
        arg11.field1405 += arg11.field1418 * arg5;
        arg11.field1416 += arg11.field1407 * arg5;
        arg11.field1406 = arg6;
        arg11.field1411 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(II[B[IIIIIIILlca;II)I", line = 367)
    private static final int method525(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10, int arg11, int arg12) {
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
        arg10.field1411 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)V", line = 393)
    public final synchronized void method526(int arg0) {
        if (this.field1417 > 0) {
            if (arg0 >= this.field1417) {
                if (this.field1415 == Integer.MIN_VALUE) {
                    this.field1415 = 0;
                    this.field1406 = this.field1405 = this.field1416 = 0;
                    this.method2360((byte) 66);
                    arg0 = this.field1417;
                }
                this.field1417 = 0;
                this.method542();
            } else {
                this.field1406 += this.field1414 * arg0;
                this.field1405 += this.field1418 * arg0;
                this.field1416 += this.field1407 * arg0;
                this.field1417 -= arg0;
            }
        }
        class396 var2 = (class396) super.field9404;
        int var3 = this.field1410 << 8;
        int var4 = this.field1408 << 8;
        int var5 = var2.field5988.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1413 = 0;
        }
        if (this.field1411 < 0) {
            if (this.field1412 <= 0) {
                this.method551();
                this.method2360((byte) 66);
                return;
            }
            this.field1411 = 0;
        }
        if (this.field1411 >= var5) {
            if (this.field1412 >= 0) {
                this.method551();
                this.method2360((byte) 66);
                return;
            }
            this.field1411 = var5 - 1;
        }
        this.field1411 += this.field1412 * arg0;
        if (this.field1413 < 0) {
            if (!this.field1409) {
                if (this.field1412 < 0) {
                    if (this.field1411 < var3) {
                        this.field1411 = var4 - 1 - (var4 - 1 - this.field1411) % var6;
                    }
                } else if (this.field1411 >= var4) {
                    this.field1411 = (this.field1411 - var3) % var6 + var3;
                }
            } else {
                if (this.field1412 < 0) {
                    if (this.field1411 >= var3) {
                        return;
                    }
                    this.field1411 = var3 + var3 - 1 - this.field1411;
                    this.field1412 = -this.field1412;
                }
                while (this.field1411 >= var4) {
                    this.field1411 = var4 + var4 - 1 - this.field1411;
                    this.field1412 = -this.field1412;
                    if (this.field1411 >= var3) {
                        return;
                    }
                    this.field1411 = var3 + var3 - 1 - this.field1411;
                    this.field1412 = -this.field1412;
                }
            }
        } else {
            if (this.field1413 > 0) {
                if (this.field1409) {
                    label125: {
                        if (this.field1412 < 0) {
                            if (this.field1411 >= var3) {
                                return;
                            }
                            this.field1411 = var3 + var3 - 1 - this.field1411;
                            this.field1412 = -this.field1412;
                            if (--this.field1413 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1411 < var4) {
                                return;
                            }
                            this.field1411 = var4 + var4 - 1 - this.field1411;
                            this.field1412 = -this.field1412;
                            if (--this.field1413 == 0) {
                                break;
                            }
                            if (this.field1411 >= var3) {
                                return;
                            }
                            this.field1411 = var3 + var3 - 1 - this.field1411;
                            this.field1412 = -this.field1412;
                        } while (--this.field1413 != 0);
                    }
                } else if (this.field1412 < 0) {
                    if (this.field1411 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1411) / var6;
                    if (var7 < this.field1413) {
                        this.field1411 += var6 * var7;
                        this.field1413 -= var7;
                        return;
                    }
                    this.field1411 += this.field1413 * var6;
                    this.field1413 = 0;
                } else {
                    if (this.field1411 < var4) {
                        return;
                    }
                    int var8 = (this.field1411 - var3) / var6;
                    if (var8 < this.field1413) {
                        this.field1411 -= var6 * var8;
                        this.field1413 -= var8;
                        return;
                    }
                    this.field1411 -= this.field1413 * var6;
                    this.field1413 = 0;
                }
            }
            if (this.field1412 < 0) {
                if (this.field1411 < 0) {
                    this.field1411 = -1;
                    this.method551();
                    this.method2360((byte) 66);
                    return;
                }
            } else if (this.field1411 >= var5) {
                this.field1411 = var5;
                this.method551();
                this.method2360((byte) 66);
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(II[B[IIIIIIILlca;II)I", line = 612)
    private static final int method527(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10, int arg11, int arg12) {
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
        arg10.field1411 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)V", line = 639)
    public final synchronized void method528(int arg0) {
        if (arg0 == 0) {
            this.method540(0);
            this.method2360((byte) 66);
        } else if (this.field1405 == 0 && this.field1416 == 0) {
            this.field1417 = 0;
            this.field1415 = 0;
            this.field1406 = 0;
            this.method2360((byte) 66);
        } else {
            int var2 = -this.field1406;
            if (this.field1406 > var2) {
                var2 = this.field1406;
            }
            if (-this.field1405 > var2) {
                var2 = -this.field1405;
            }
            if (this.field1405 > var2) {
                var2 = this.field1405;
            }
            if (-this.field1416 > var2) {
                var2 = -this.field1416;
            }
            if (this.field1416 > var2) {
                var2 = this.field1416;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1417 = arg0;
            this.field1415 = Integer.MIN_VALUE;
            this.field1414 = -this.field1406 / arg0;
            this.field1418 = -this.field1405 / arg0;
            this.field1407 = -this.field1416 / arg0;
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "([IIIII)I", line = 685)
    private final int method529(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1417 <= 0) {
                if (this.field1412 == -256 && (this.field1411 & 255) == 0) {
                    if (class550.field8108) {
                        return method520(0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, 0, arg3, arg2, this);
                    }
                    return method553(((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, 0, arg3, arg2, this);
                }
                if (class550.field8108) {
                    return method515(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, 0, arg3, arg2, this, this.field1412, arg4);
                }
                return method525(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, 0, arg3, arg2, this, this.field1412, arg4);
            }
            int var6 = this.field1417 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1417 += arg1;
            if (this.field1412 == -256 && (this.field1411 & 255) == 0) {
                if (class550.field8108) {
                    arg1 = method555(0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, this.field1418, this.field1407, 0, var6, arg2, this);
                } else {
                    arg1 = method548(((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, this.field1414, 0, var6, arg2, this);
                }
            } else if (class550.field8108) {
                arg1 = method536(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1405, this.field1416, this.field1418, this.field1407, 0, var6, arg2, this, this.field1412, arg4);
            } else {
                arg1 = method539(0, 0, ((class396) super.field9404).field5988, arg0, this.field1411, arg1, this.field1406, this.field1414, 0, var6, arg2, this, this.field1412, arg4);
            }
            this.field1417 -= arg1;
            if (this.field1417 != 0) {
                return arg1;
            }
        } while (!this.method522());
        return arg3;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(II)V", line = 740)
    private final synchronized void method530(int arg0, int arg1) {
        this.field1415 = arg0;
        this.field1419 = arg1;
        this.field1417 = 0;
        this.method542();
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "()Lac;", line = 750)
    public final class659 method531() {
        return null;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(II)I", line = 753)
    private static final int method532(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "([B[IIIIIIILlca;)I", line = 758)
    private static final int method533(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8) {
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
        arg8.field1411 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "()Lac;", line = 783)
    public final class659 method534() {
        return null;
    }

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "()I", line = 789)
    public final synchronized int method535() {
        return this.field1419 < 0 ? -1 : this.field1419;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(II[B[IIIIIIIIIILlca;II)I", line = 792)
    private static final int method536(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class93 arg13, int arg14, int arg15) {
        arg13.field1406 -= arg13.field1414 * arg5;
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
        arg13.field1406 += arg13.field1414 * var22;
        arg13.field1405 = arg6;
        arg13.field1416 = arg7;
        arg13.field1411 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lwm;III)Llca;", line = 833)
    public static final class93 method537(class396 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5988 != null && arg0.field5988.length != 0 ? new class93(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(I)V", line = 839)
    public final synchronized void method538(int arg0) {
        this.method530(arg0 << 6, this.method535());
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(II[B[IIIIIIIILlca;II)I", line = 842)
    private static final int method539(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
        arg11.field1405 -= arg11.field1418 * arg5;
        arg11.field1416 -= arg11.field1407 * arg5;
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
        arg11.field1405 += arg11.field1418 * arg5;
        arg11.field1416 += arg11.field1407 * arg5;
        arg11.field1406 = arg6;
        arg11.field1411 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!lca", name = "f", descriptor = "(I)V", line = 875)
    private final synchronized void method540(int arg0) {
        this.method530(arg0, this.method535());
    }

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)V", line = 880)
    public final synchronized void method541(int arg0) {
        int var2 = ((class396) super.field9404).field5988.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1411 = arg0;
    }

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "()V", line = 890)
    private final void method542() {
        this.field1406 = this.field1415;
        this.field1405 = method532(this.field1415, this.field1419);
        this.field1416 = method518(this.field1415, this.field1419);
    }

    @OriginalMember(owner = "client!lca", name = "h", descriptor = "(I)V", line = 895)
    public final synchronized void method543(int arg0) {
        this.method530(this.method556(), arg0);
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I[B[IIIIIIIILlca;)I", line = 898)
    private static final int method544(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class93 arg10) {
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
        arg10.field1411 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "()I", line = 937)
    public final int method545() {
        return this.field1415 == 0 && this.field1417 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(II[B[IIIIIIIILlca;II)I", line = 943)
    private static final int method546(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class93 arg11, int arg12, int arg13) {
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
        arg11.field1411 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!lca", name = "j", descriptor = "()Z", line = 976)
    public final boolean method547() {
        return this.field1411 < 0 || this.field1411 >= ((class396) super.field9404).field5988.length << 8;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "([B[IIIIIIIILlca;)I", line = 979)
    private static final int method548(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class93 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1405 += (var14 - arg3) * arg9.field1418;
        arg9.field1416 += (var14 - arg3) * arg9.field1407;
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
        arg9.field1406 = var12 >> 2;
        arg9.field1411 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "([III)V", line = 1014)
    public final synchronized void method549(int[] arg0, int arg1, int arg2) {
        if (this.field1415 == 0 && this.field1417 == 0) {
            this.method526(arg2);
        } else {
            class396 var4 = (class396) super.field9404;
            int var5 = this.field1410 << 8;
            int var6 = this.field1408 << 8;
            int var7 = var4.field5988.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1413 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1411 < 0) {
                if (this.field1412 <= 0) {
                    this.method551();
                    this.method2360((byte) 66);
                    return;
                }
                this.field1411 = 0;
            }
            if (this.field1411 >= var7) {
                if (this.field1412 >= 0) {
                    this.method551();
                    this.method2360((byte) 66);
                    return;
                }
                this.field1411 = var7 - 1;
            }
            if (this.field1413 < 0) {
                if (this.field1409) {
                    if (this.field1412 < 0) {
                        var9 = this.method529(arg0, arg1, var5, var10, var4.field5988[this.field1410]);
                        if (this.field1411 >= var5) {
                            return;
                        }
                        this.field1411 = var5 + var5 - 1 - this.field1411;
                        this.field1412 = -this.field1412;
                    }
                    while (true) {
                        int var11 = this.method516(arg0, var9, var6, var10, var4.field5988[this.field1408 - 1]);
                        if (this.field1411 < var6) {
                            return;
                        }
                        this.field1411 = var6 + var6 - 1 - this.field1411;
                        this.field1412 = -this.field1412;
                        var9 = this.method529(arg0, var11, var5, var10, var4.field5988[this.field1410]);
                        if (this.field1411 >= var5) {
                            return;
                        }
                        this.field1411 = var5 + var5 - 1 - this.field1411;
                        this.field1412 = -this.field1412;
                    }
                } else if (this.field1412 < 0) {
                    while (true) {
                        var9 = this.method529(arg0, var9, var5, var10, var4.field5988[this.field1408 - 1]);
                        if (this.field1411 >= var5) {
                            return;
                        }
                        this.field1411 = var6 - 1 - (var6 - 1 - this.field1411) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method516(arg0, var9, var6, var10, var4.field5988[this.field1410]);
                        if (this.field1411 < var6) {
                            return;
                        }
                        this.field1411 = (this.field1411 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1413 > 0) {
                    if (this.field1409) {
                        label130: {
                            if (this.field1412 < 0) {
                                var9 = this.method529(arg0, arg1, var5, var10, var4.field5988[this.field1410]);
                                if (this.field1411 >= var5) {
                                    return;
                                }
                                this.field1411 = var5 + var5 - 1 - this.field1411;
                                this.field1412 = -this.field1412;
                                if (--this.field1413 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method516(arg0, var9, var6, var10, var4.field5988[this.field1408 - 1]);
                                if (this.field1411 < var6) {
                                    return;
                                }
                                this.field1411 = var6 + var6 - 1 - this.field1411;
                                this.field1412 = -this.field1412;
                                if (--this.field1413 == 0) {
                                    break;
                                }
                                var9 = this.method529(arg0, var9, var5, var10, var4.field5988[this.field1410]);
                                if (this.field1411 >= var5) {
                                    return;
                                }
                                this.field1411 = var5 + var5 - 1 - this.field1411;
                                this.field1412 = -this.field1412;
                            } while (--this.field1413 != 0);
                        }
                    } else if (this.field1412 < 0) {
                        while (true) {
                            var9 = this.method529(arg0, var9, var5, var10, var4.field5988[this.field1408 - 1]);
                            if (this.field1411 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1411) / var8;
                            if (var12 >= this.field1413) {
                                this.field1411 += this.field1413 * var8;
                                this.field1413 = 0;
                                break;
                            }
                            this.field1411 += var8 * var12;
                            this.field1413 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method516(arg0, var9, var6, var10, var4.field5988[this.field1410]);
                            if (this.field1411 < var6) {
                                return;
                            }
                            int var13 = (this.field1411 - var5) / var8;
                            if (var13 >= this.field1413) {
                                this.field1411 -= this.field1413 * var8;
                                this.field1413 = 0;
                                break;
                            }
                            this.field1411 -= var8 * var13;
                            this.field1413 -= var13;
                        }
                    }
                }
                if (this.field1412 < 0) {
                    this.method529(arg0, var9, 0, var10, 0);
                    if (this.field1411 < 0) {
                        this.field1411 = -1;
                        this.method551();
                        this.method2360((byte) 66);
                        return;
                    }
                } else {
                    this.method516(arg0, var9, var7, var10, 0);
                    if (this.field1411 >= var7) {
                        this.field1411 = var7;
                        this.method551();
                        this.method2360((byte) 66);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(II)V", line = 1249)
    public final synchronized void method550(int arg0, int arg1) {
        this.method513(arg0, arg1, this.method535());
    }

    @OriginalMember(owner = "client!lca", name = "k", descriptor = "()V", line = 1252)
    private final void method551() {
        if (this.field1417 != 0) {
            if (this.field1415 == Integer.MIN_VALUE) {
                this.field1415 = 0;
            }
            this.field1417 = 0;
            this.method542();
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I[B[IIIIIIIIIILlca;)I", line = 1264)
    private static final int method552(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class93 arg12) {
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
        arg12.field1406 += (var19 - arg4) * arg12.field1414;
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
        arg12.field1405 = var15 >> 2;
        arg12.field1416 = var16 >> 2;
        arg12.field1411 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "([B[IIIIIIILlca;)I", line = 1317)
    private static final int method553(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class93 arg8) {
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
        arg8.field1411 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "([B[IIIIIIIILlca;)I", line = 1345)
    private static final int method554(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class93 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1405 += (var14 - arg3) * arg9.field1418;
        arg9.field1416 += (var14 - arg3) * arg9.field1407;
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
        arg9.field1406 = var12 >> 2;
        arg9.field1411 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I[B[IIIIIIIIIILlca;)I", line = 1379)
    private static final int method555(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class93 arg12) {
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
        arg12.field1406 += (var19 - arg4) * arg12.field1414;
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
        arg12.field1405 = var15 >> 2;
        arg12.field1416 = var16 >> 2;
        arg12.field1411 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!lca", name = "l", descriptor = "()I", line = 1432)
    public final synchronized int method556() {
        return this.field1415 == Integer.MIN_VALUE ? 0 : this.field1415;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "()I", line = 1438)
    public final int method557() {
        int var1 = this.field1406 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1413 == 0) {
            var2 -= this.field1411 * var2 / (((class396) super.field9404).field5988.length << 8);
        } else if (this.field1413 >= 0) {
            var2 -= this.field1410 * var2 / ((class396) super.field9404).field5988.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!lca", name = "i", descriptor = "(I)V", line = 1453)
    public final synchronized void method558(int arg0) {
        this.field1413 = arg0;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lwm;III)V", line = 1456)
    private class93(class396 arg0, int arg1, int arg2, int arg3) {
        super.field9404 = arg0;
        this.field1410 = arg0.field5987;
        this.field1408 = arg0.field5991;
        this.field1409 = arg0.field5990;
        this.field1412 = arg1;
        this.field1415 = arg2;
        this.field1419 = arg3;
        this.field1411 = 0;
        this.method542();
    }
}
