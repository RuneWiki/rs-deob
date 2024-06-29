import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class81 extends class104 {

    @OriginalMember(owner = "client!nc", name = "F", descriptor = "I")
    private int field1353;

    @OriginalMember(owner = "client!nc", name = "G", descriptor = "I")
    private int field1354;

    @OriginalMember(owner = "client!nc", name = "K", descriptor = "Z")
    private boolean field1358;

    @OriginalMember(owner = "client!nc", name = "H", descriptor = "I")
    private int field1355;

    @OriginalMember(owner = "client!nc", name = "I", descriptor = "I")
    private int field1356;

    @OriginalMember(owner = "client!nc", name = "z", descriptor = "I")
    private int field1347;

    @OriginalMember(owner = "client!nc", name = "J", descriptor = "I")
    private int field1357;

    @OriginalMember(owner = "client!nc", name = "A", descriptor = "I")
    private int field1348;

    @OriginalMember(owner = "client!nc", name = "B", descriptor = "I")
    private int field1349;

    @OriginalMember(owner = "client!nc", name = "C", descriptor = "I")
    private int field1350;

    @OriginalMember(owner = "client!nc", name = "D", descriptor = "I")
    private int field1351;

    @OriginalMember(owner = "client!nc", name = "E", descriptor = "I")
    private int field1352;

    @OriginalMember(owner = "client!nc", name = "L", descriptor = "I")
    private int field1359;

    @OriginalMember(owner = "client!nc", name = "M", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!nc", name = "N", descriptor = "I")
    private int field1361;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method597(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
        arg11.field1352 -= arg11.field1360 * arg5;
        arg11.field1351 -= arg11.field1359 * arg5;
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
        arg11.field1352 += arg11.field1360 * arg5;
        arg11.field1351 += arg11.field1359 * arg5;
        arg11.field1348 = arg6;
        arg11.field1357 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[B[IIIIIIILnc;II)I")
    private static final int method598(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10, int arg11, int arg12) {
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
        arg10.field1357 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(I)V")
    public final synchronized void method599(int arg0) {
        this.method616(arg0 << 6, this.method631());
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(I)V")
    public final synchronized void method600(int arg0) {
        this.field1350 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
    public final synchronized void method601(boolean arg0) {
        this.field1355 = (this.field1355 >>> 31) + (this.field1355 ^ this.field1355 >> 31);
        if (arg0) {
            this.field1355 = -this.field1355;
        }
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "()I")
    public final int method491() {
        return this.field1356 == 0 && this.field1361 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([III)V")
    public final synchronized void method498(int[] arg0, int arg1, int arg2) {
        if (this.field1356 == 0 && this.field1361 == 0) {
            this.method496(arg2);
        } else {
            class224 var4 = (class224) super.field1725;
            int var5 = this.field1353 << 8;
            int var6 = this.field1354 << 8;
            int var7 = var4.field3943.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1350 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1357 < 0) {
                if (this.field1355 <= 0) {
                    this.method630();
                    this.method764((byte) -83);
                    return;
                }
                this.field1357 = 0;
            }
            if (this.field1357 >= var7) {
                if (this.field1355 >= 0) {
                    this.method630();
                    this.method764((byte) -59);
                    return;
                }
                this.field1357 = var7 - 1;
            }
            if (this.field1350 < 0) {
                if (this.field1358) {
                    if (this.field1355 < 0) {
                        var9 = this.method635(arg0, arg1, var5, var10, var4.field3943[this.field1353]);
                        if (this.field1357 >= var5) {
                            return;
                        }
                        this.field1357 = var5 + var5 - 1 - this.field1357;
                        this.field1355 = -this.field1355;
                    }
                    while (true) {
                        int var11 = this.method610(arg0, var9, var6, var10, var4.field3943[this.field1354 - 1]);
                        if (this.field1357 < var6) {
                            return;
                        }
                        this.field1357 = var6 + var6 - 1 - this.field1357;
                        this.field1355 = -this.field1355;
                        var9 = this.method635(arg0, var11, var5, var10, var4.field3943[this.field1353]);
                        if (this.field1357 >= var5) {
                            return;
                        }
                        this.field1357 = var5 + var5 - 1 - this.field1357;
                        this.field1355 = -this.field1355;
                    }
                } else if (this.field1355 < 0) {
                    while (true) {
                        var9 = this.method635(arg0, var9, var5, var10, var4.field3943[this.field1354 - 1]);
                        if (this.field1357 >= var5) {
                            return;
                        }
                        this.field1357 = var6 - 1 - (var6 - 1 - this.field1357) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method610(arg0, var9, var6, var10, var4.field3943[this.field1353]);
                        if (this.field1357 < var6) {
                            return;
                        }
                        this.field1357 = (this.field1357 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1350 > 0) {
                    if (this.field1358) {
                        label130: {
                            if (this.field1355 < 0) {
                                var9 = this.method635(arg0, arg1, var5, var10, var4.field3943[this.field1353]);
                                if (this.field1357 >= var5) {
                                    return;
                                }
                                this.field1357 = var5 + var5 - 1 - this.field1357;
                                this.field1355 = -this.field1355;
                                if (--this.field1350 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method610(arg0, var9, var6, var10, var4.field3943[this.field1354 - 1]);
                                if (this.field1357 < var6) {
                                    return;
                                }
                                this.field1357 = var6 + var6 - 1 - this.field1357;
                                this.field1355 = -this.field1355;
                                if (--this.field1350 == 0) {
                                    break;
                                }
                                var9 = this.method635(arg0, var9, var5, var10, var4.field3943[this.field1353]);
                                if (this.field1357 >= var5) {
                                    return;
                                }
                                this.field1357 = var5 + var5 - 1 - this.field1357;
                                this.field1355 = -this.field1355;
                            } while (--this.field1350 != 0);
                        }
                    } else if (this.field1355 < 0) {
                        while (true) {
                            var9 = this.method635(arg0, var9, var5, var10, var4.field3943[this.field1354 - 1]);
                            if (this.field1357 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1357) / var8;
                            if (var12 >= this.field1350) {
                                this.field1357 += this.field1350 * var8;
                                this.field1350 = 0;
                                break;
                            }
                            this.field1357 += var8 * var12;
                            this.field1350 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method610(arg0, var9, var6, var10, var4.field3943[this.field1353]);
                            if (this.field1357 < var6) {
                                return;
                            }
                            int var13 = (this.field1357 - var5) / var8;
                            if (var13 >= this.field1350) {
                                this.field1357 -= this.field1350 * var8;
                                this.field1350 = 0;
                                break;
                            }
                            this.field1357 -= var8 * var13;
                            this.field1350 -= var13;
                        }
                    }
                }
                if (this.field1355 < 0) {
                    this.method635(arg0, var9, 0, var10, 0);
                    if (this.field1357 < 0) {
                        this.field1357 = -1;
                        this.method630();
                        this.method764((byte) -86);
                        return;
                    }
                } else {
                    this.method610(arg0, var9, var7, var10, 0);
                    if (this.field1357 >= var7) {
                        this.field1357 = var7;
                        this.method630();
                        this.method764((byte) -59);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(I)V")
    private final synchronized void method602(int arg0) {
        this.method616(arg0, this.method631());
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(II[B[IIIIIIIIIILnc;II)I")
    private static final int method603(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class81 arg13, int arg14, int arg15) {
        arg13.field1348 -= arg13.field1349 * arg5;
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
        arg13.field1348 += arg13.field1349 * var22;
        arg13.field1352 = arg6;
        arg13.field1351 = arg7;
        arg13.field1357 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "()I")
    public final int method604() {
        int var1 = this.field1348 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1350 == 0) {
            var2 -= this.field1357 * var2 / (((class224) super.field1725).field3943.length << 8);
        } else if (this.field1350 >= 0) {
            var2 -= this.field1353 * var2 / ((class224) super.field1725).field3943.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "()Lth;")
    public final class104 method493() {
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(III)V")
    public final synchronized void method605(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method616(arg1, arg2);
        } else {
            int var4 = method609(arg1, arg2);
            int var5 = method618(arg1, arg2);
            if (this.field1352 == var4 && this.field1351 == var5) {
                this.field1361 = 0;
            } else {
                int var6 = arg1 - this.field1348;
                if (this.field1348 - arg1 > var6) {
                    var6 = this.field1348 - arg1;
                }
                if (var4 - this.field1352 > var6) {
                    var6 = var4 - this.field1352;
                }
                if (this.field1352 - var4 > var6) {
                    var6 = this.field1352 - var4;
                }
                if (var5 - this.field1351 > var6) {
                    var6 = var5 - this.field1351;
                }
                if (this.field1351 - var5 > var6) {
                    var6 = this.field1351 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1361 = arg0;
                this.field1356 = arg1;
                this.field1347 = arg2;
                this.field1349 = (arg1 - this.field1348) / arg0;
                this.field1360 = (var4 - this.field1352) / arg0;
                this.field1359 = (var5 - this.field1351) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method606(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
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
        arg11.field1357 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II[B[IIIIIIILnc;II)I")
    private static final int method607(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10, int arg11, int arg12) {
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
        arg10.field1357 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
    public final synchronized void method496(int arg0) {
        if (this.field1361 > 0) {
            if (arg0 >= this.field1361) {
                if (this.field1356 == Integer.MIN_VALUE) {
                    this.field1356 = 0;
                    this.field1348 = this.field1352 = this.field1351 = 0;
                    this.method764((byte) -88);
                    arg0 = this.field1361;
                }
                this.field1361 = 0;
                this.method626();
            } else {
                this.field1348 += this.field1349 * arg0;
                this.field1352 += this.field1360 * arg0;
                this.field1351 += this.field1359 * arg0;
                this.field1361 -= arg0;
            }
        }
        class224 var2 = (class224) super.field1725;
        int var3 = this.field1353 << 8;
        int var4 = this.field1354 << 8;
        int var5 = var2.field3943.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1350 = 0;
        }
        if (this.field1357 < 0) {
            if (this.field1355 <= 0) {
                this.method630();
                this.method764((byte) -55);
                return;
            }
            this.field1357 = 0;
        }
        if (this.field1357 >= var5) {
            if (this.field1355 >= 0) {
                this.method630();
                this.method764((byte) -53);
                return;
            }
            this.field1357 = var5 - 1;
        }
        this.field1357 += this.field1355 * arg0;
        if (this.field1350 < 0) {
            if (!this.field1358) {
                if (this.field1355 < 0) {
                    if (this.field1357 < var3) {
                        this.field1357 = var4 - 1 - (var4 - 1 - this.field1357) % var6;
                    }
                } else if (this.field1357 >= var4) {
                    this.field1357 = (this.field1357 - var3) % var6 + var3;
                }
            } else {
                if (this.field1355 < 0) {
                    if (this.field1357 >= var3) {
                        return;
                    }
                    this.field1357 = var3 + var3 - 1 - this.field1357;
                    this.field1355 = -this.field1355;
                }
                while (this.field1357 >= var4) {
                    this.field1357 = var4 + var4 - 1 - this.field1357;
                    this.field1355 = -this.field1355;
                    if (this.field1357 >= var3) {
                        return;
                    }
                    this.field1357 = var3 + var3 - 1 - this.field1357;
                    this.field1355 = -this.field1355;
                }
            }
        } else {
            if (this.field1350 > 0) {
                if (this.field1358) {
                    label125: {
                        if (this.field1355 < 0) {
                            if (this.field1357 >= var3) {
                                return;
                            }
                            this.field1357 = var3 + var3 - 1 - this.field1357;
                            this.field1355 = -this.field1355;
                            if (--this.field1350 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1357 < var4) {
                                return;
                            }
                            this.field1357 = var4 + var4 - 1 - this.field1357;
                            this.field1355 = -this.field1355;
                            if (--this.field1350 == 0) {
                                break;
                            }
                            if (this.field1357 >= var3) {
                                return;
                            }
                            this.field1357 = var3 + var3 - 1 - this.field1357;
                            this.field1355 = -this.field1355;
                        } while (--this.field1350 != 0);
                    }
                } else if (this.field1355 < 0) {
                    if (this.field1357 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1357) / var6;
                    if (var7 < this.field1350) {
                        this.field1357 += var6 * var7;
                        this.field1350 -= var7;
                        return;
                    }
                    this.field1357 += this.field1350 * var6;
                    this.field1350 = 0;
                } else {
                    if (this.field1357 < var4) {
                        return;
                    }
                    int var8 = (this.field1357 - var3) / var6;
                    if (var8 < this.field1350) {
                        this.field1357 -= var6 * var8;
                        this.field1350 -= var8;
                        return;
                    }
                    this.field1357 -= this.field1350 * var6;
                    this.field1350 = 0;
                }
            }
            if (this.field1355 < 0) {
                if (this.field1357 < 0) {
                    this.field1357 = -1;
                    this.method630();
                    this.method764((byte) -42);
                    return;
                }
            } else if (this.field1357 >= var5) {
                this.field1357 = var5;
                this.method630();
                this.method764((byte) -62);
            }
        }
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "()I")
    public final synchronized int method608() {
        return this.field1356 == Integer.MIN_VALUE ? 0 : this.field1356;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II)I")
    private static final int method609(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([IIIII)I")
    private final int method610(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1361 <= 0) {
                if (this.field1355 == 256 && (this.field1357 & 255) == 0) {
                    if (class34.field498) {
                        return method636(0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, 0, arg3, arg2, this);
                    }
                    return method621(((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, 0, arg3, arg2, this);
                }
                if (class34.field498) {
                    return method606(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, 0, arg3, arg2, this, this.field1355, arg4);
                }
                return method607(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, 0, arg3, arg2, this, this.field1355, arg4);
            }
            int var6 = this.field1361 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1361 += arg1;
            if (this.field1355 == 256 && (this.field1357 & 255) == 0) {
                if (class34.field498) {
                    arg1 = method613(0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, this.field1360, this.field1359, 0, var6, arg2, this);
                } else {
                    arg1 = method625(((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, this.field1349, 0, var6, arg2, this);
                }
            } else if (class34.field498) {
                arg1 = method603(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, this.field1360, this.field1359, 0, var6, arg2, this, this.field1355, arg4);
            } else {
                arg1 = method597(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, this.field1349, 0, var6, arg2, this, this.field1355, arg4);
            }
            this.field1361 -= arg1;
            if (this.field1361 != 0) {
                return arg1;
            }
        } while (!this.method627());
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lci;III)Lnc;")
    public static final class81 method611(class224 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3943 != null && arg0.field3943.length != 0 ? new class81(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(II[B[IIIIIIIIIILnc;II)I")
    private static final int method612(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class81 arg13, int arg14, int arg15) {
        arg13.field1348 -= arg13.field1349 * arg5;
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
        arg13.field1348 += arg13.field1349 * var22;
        arg13.field1352 = arg6;
        arg13.field1351 = arg7;
        arg13.field1357 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B[IIIIIIIIIILnc;)I")
    private static final int method613(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class81 arg12) {
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
        arg12.field1348 += (var19 - arg4) * arg12.field1349;
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
        arg12.field1352 = var15 >> 2;
        arg12.field1351 = var16 >> 2;
        arg12.field1357 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "(I)V")
    public final synchronized void method614(int arg0) {
        if (arg0 == 0) {
            this.method602(0);
            this.method764((byte) -90);
        } else if (this.field1352 == 0 && this.field1351 == 0) {
            this.field1361 = 0;
            this.field1356 = 0;
            this.field1348 = 0;
            this.method764((byte) -33);
        } else {
            int var2 = -this.field1348;
            if (this.field1348 > var2) {
                var2 = this.field1348;
            }
            if (-this.field1352 > var2) {
                var2 = -this.field1352;
            }
            if (this.field1352 > var2) {
                var2 = this.field1352;
            }
            if (-this.field1351 > var2) {
                var2 = -this.field1351;
            }
            if (this.field1351 > var2) {
                var2 = this.field1351;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1361 = arg0;
            this.field1356 = Integer.MIN_VALUE;
            this.field1349 = -this.field1348 / arg0;
            this.field1360 = -this.field1352 / arg0;
            this.field1359 = -this.field1351 / arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "(I)V")
    public final synchronized void method615(int arg0) {
        int var2 = ((class224) super.field1725).field3943.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1357 = arg0;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II)V")
    private final synchronized void method616(int arg0, int arg1) {
        this.field1356 = arg0;
        this.field1347 = arg1;
        this.field1361 = 0;
        this.method626();
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "()Z")
    public final boolean method617() {
        return this.field1357 < 0 || this.field1357 >= ((class224) super.field1725).field3943.length << 8;
    }

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "(II)I")
    private static final int method618(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I[B[IIIIIIIIIILnc;)I")
    private static final int method619(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class81 arg12) {
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
        arg12.field1348 += (var19 - arg4) * arg12.field1349;
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
        arg12.field1352 = var15 >> 2;
        arg12.field1351 = var16 >> 2;
        arg12.field1357 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I[B[IIIIIIIILnc;)I")
    private static final int method620(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10) {
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
        arg10.field1357 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[IIIIIIILnc;)I")
    private static final int method621(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8) {
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
        arg8.field1357 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "(I)V")
    public final synchronized void method622(int arg0) {
        if (this.field1355 < 0) {
            this.field1355 = -arg0;
        } else {
            this.field1355 = arg0;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "([B[IIIIIIIILnc;)I")
    private static final int method623(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class81 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1352 += (var14 - arg3) * arg9.field1360;
        arg9.field1351 += (var14 - arg3) * arg9.field1359;
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
        arg9.field1348 = var12 >> 2;
        arg9.field1357 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method624(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
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
        arg11.field1357 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([B[IIIIIIIILnc;)I")
    private static final int method625(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class81 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1352 += (var14 - arg3) * arg9.field1360;
        arg9.field1351 += (var14 - arg3) * arg9.field1359;
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
        arg9.field1348 = var12 >> 2;
        arg9.field1357 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "()V")
    private final void method626() {
        this.field1348 = this.field1356;
        this.field1352 = method609(this.field1356, this.field1347);
        this.field1351 = method618(this.field1356, this.field1347);
    }

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "()Z")
    private final boolean method627() {
        int var1 = this.field1356;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method609(var1, this.field1347);
            var2 = method618(var1, this.field1347);
        }
        if (this.field1348 == var1 && this.field1352 == var3 && this.field1351 == var2) {
            if (this.field1356 == Integer.MIN_VALUE) {
                this.field1356 = 0;
                this.field1348 = this.field1352 = this.field1351 = 0;
                this.method764((byte) -96);
                return true;
            } else {
                this.method626();
                return false;
            }
        } else {
            if (this.field1348 < var1) {
                this.field1349 = 1;
                this.field1361 = var1 - this.field1348;
            } else if (this.field1348 > var1) {
                this.field1349 = -1;
                this.field1361 = this.field1348 - var1;
            } else {
                this.field1349 = 0;
            }
            if (this.field1352 < var3) {
                this.field1360 = 1;
                if (this.field1361 == 0 || this.field1361 > var3 - this.field1352) {
                    this.field1361 = var3 - this.field1352;
                }
            } else if (this.field1352 > var3) {
                this.field1360 = -1;
                if (this.field1361 == 0 || this.field1361 > this.field1352 - var3) {
                    this.field1361 = this.field1352 - var3;
                }
            } else {
                this.field1360 = 0;
            }
            if (this.field1351 < var2) {
                this.field1359 = 1;
                if (this.field1361 == 0 || this.field1361 > var2 - this.field1351) {
                    this.field1361 = var2 - this.field1351;
                }
            } else if (this.field1351 > var2) {
                this.field1359 = -1;
                if (this.field1361 == 0 || this.field1361 > this.field1351 - var2) {
                    this.field1361 = this.field1351 - var2;
                }
            } else {
                this.field1359 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "()Lth;")
    public final class104 method490() {
        return null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lci;II)Lnc;")
    public static final class81 method628(class224 arg0, int arg1, int arg2) {
        return arg0.field3943 != null && arg0.field3943.length != 0 ? new class81(arg0, (int) ((long) arg0.field3942 * 256L * (long) arg1 / (long) (class156.field2568 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "()I")
    public final synchronized int method629() {
        return this.field1355 < 0 ? -this.field1355 : this.field1355;
    }

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "()V")
    private final void method630() {
        if (this.field1361 != 0) {
            if (this.field1356 == Integer.MIN_VALUE) {
                this.field1356 = 0;
            }
            this.field1361 = 0;
            this.method626();
        }
    }

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "()I")
    public final synchronized int method631() {
        return this.field1347 < 0 ? -1 : this.field1347;
    }

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "(II[B[IIIIIIIILnc;II)I")
    private static final int method632(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class81 arg11, int arg12, int arg13) {
        arg11.field1352 -= arg11.field1360 * arg5;
        arg11.field1351 -= arg11.field1359 * arg5;
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
        arg11.field1352 += arg11.field1360 * arg5;
        arg11.field1351 += arg11.field1359 * arg5;
        arg11.field1348 = arg6;
        arg11.field1357 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "(II)V")
    public final synchronized void method633(int arg0, int arg1) {
        this.method605(arg0, arg1, this.method631());
    }

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "()Z")
    public final boolean method634() {
        return this.field1361 != 0;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lci;II)V")
    private class81(class224 arg0, int arg1, int arg2) {
        super.field1725 = arg0;
        this.field1353 = arg0.field3940;
        this.field1354 = arg0.field3944;
        this.field1358 = arg0.field3941;
        this.field1355 = arg1;
        this.field1356 = arg2;
        this.field1347 = 8192;
        this.field1357 = 0;
        this.method626();
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([IIIII)I")
    private final int method635(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1361 <= 0) {
                if (this.field1355 == -256 && (this.field1357 & 255) == 0) {
                    if (class34.field498) {
                        return method620(0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, 0, arg3, arg2, this);
                    }
                    return method637(((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, 0, arg3, arg2, this);
                }
                if (class34.field498) {
                    return method624(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, 0, arg3, arg2, this, this.field1355, arg4);
                }
                return method598(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, 0, arg3, arg2, this, this.field1355, arg4);
            }
            int var6 = this.field1361 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1361 += arg1;
            if (this.field1355 == -256 && (this.field1357 & 255) == 0) {
                if (class34.field498) {
                    arg1 = method619(0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, this.field1360, this.field1359, 0, var6, arg2, this);
                } else {
                    arg1 = method623(((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, this.field1349, 0, var6, arg2, this);
                }
            } else if (class34.field498) {
                arg1 = method612(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1352, this.field1351, this.field1360, this.field1359, 0, var6, arg2, this, this.field1355, arg4);
            } else {
                arg1 = method632(0, 0, ((class224) super.field1725).field3943, arg0, this.field1357, arg1, this.field1348, this.field1349, 0, var6, arg2, this, this.field1355, arg4);
            }
            this.field1361 -= arg1;
            if (this.field1361 != 0) {
                return arg1;
            }
        } while (!this.method627());
        return arg3;
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lci;III)V")
    private class81(class224 arg0, int arg1, int arg2, int arg3) {
        super.field1725 = arg0;
        this.field1353 = arg0.field3940;
        this.field1354 = arg0.field3944;
        this.field1358 = arg0.field3941;
        this.field1355 = arg1;
        this.field1356 = arg2;
        this.field1347 = arg3;
        this.field1357 = 0;
        this.method626();
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "(I[B[IIIIIIIILnc;)I")
    private static final int method636(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class81 arg10) {
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
        arg10.field1357 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "([B[IIIIIIILnc;)I")
    private static final int method637(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class81 arg8) {
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
        arg8.field1357 = var9 << 8;
        return arg3;
    }
}
