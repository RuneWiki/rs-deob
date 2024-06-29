import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class50 extends class129 {

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "Z")
    private boolean field1207;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    private int field1201;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    private int field1205;

    @OriginalMember(owner = "client!ha", name = "B", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    private int field1202;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "I")
    private int field1203;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    private int field1206;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!ha", name = "M", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!ha", name = "N", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "()Z")
    public final boolean method414() {
        return this.field1205 < 0 || this.field1205 >= ((class117) super.field2959).field2711.length << 8;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method415(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class50 arg11, int arg12, int arg13) {
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
        arg11.field1205 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([B[IIIIIIIILha;)I")
    private static final int method416(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class50 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1200 += (var14 - arg3) * arg9.field1206;
        arg9.field1212 += (var14 - arg3) * arg9.field1211;
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
        arg9.field1210 = var12 >> 2;
        arg9.field1205 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[B[IIIIIIIIIILha;)I")
    private static final int method417(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class50 arg12) {
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
        arg12.field1210 += (var19 - arg4) * arg12.field1203;
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
        arg12.field1200 = var15 >> 2;
        arg12.field1212 = var16 >> 2;
        arg12.field1205 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V")
    private final synchronized void method418(int arg0) {
        this.method422(arg0, this.method446());
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V")
    public final synchronized void method114(int arg0) {
        if (this.field1202 > 0) {
            if (arg0 >= this.field1202) {
                if (this.field1201 == Integer.MIN_VALUE) {
                    this.field1201 = 0;
                    this.field1210 = this.field1200 = this.field1212 = 0;
                    this.method768(-1);
                    arg0 = this.field1202;
                }
                this.field1202 = 0;
                this.method430();
            } else {
                this.field1210 += this.field1203 * arg0;
                this.field1200 += this.field1206 * arg0;
                this.field1212 += this.field1211 * arg0;
                this.field1202 -= arg0;
            }
        }
        class117 var2 = (class117) super.field2959;
        int var3 = this.field1204 << 8;
        int var4 = this.field1198 << 8;
        int var5 = var2.field2711.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1209 = 0;
        }
        if (this.field1205 < 0) {
            if (this.field1208 <= 0) {
                this.method424();
                this.method768(-1);
                return;
            }
            this.field1205 = 0;
        }
        if (this.field1205 >= var5) {
            if (this.field1208 >= 0) {
                this.method424();
                this.method768(-1);
                return;
            }
            this.field1205 = var5 - 1;
        }
        this.field1205 += this.field1208 * arg0;
        if (this.field1209 < 0) {
            if (!this.field1207) {
                if (this.field1208 < 0) {
                    if (this.field1205 < var3) {
                        this.field1205 = var4 - 1 - (var4 - 1 - this.field1205) % var6;
                    }
                } else if (this.field1205 >= var4) {
                    this.field1205 = (this.field1205 - var3) % var6 + var3;
                }
            } else {
                if (this.field1208 < 0) {
                    if (this.field1205 >= var3) {
                        return;
                    }
                    this.field1205 = var3 + var3 - 1 - this.field1205;
                    this.field1208 = -this.field1208;
                }
                while (this.field1205 >= var4) {
                    this.field1205 = var4 + var4 - 1 - this.field1205;
                    this.field1208 = -this.field1208;
                    if (this.field1205 >= var3) {
                        return;
                    }
                    this.field1205 = var3 + var3 - 1 - this.field1205;
                    this.field1208 = -this.field1208;
                }
            }
        } else {
            if (this.field1209 > 0) {
                if (this.field1207) {
                    label125: {
                        if (this.field1208 < 0) {
                            if (this.field1205 >= var3) {
                                return;
                            }
                            this.field1205 = var3 + var3 - 1 - this.field1205;
                            this.field1208 = -this.field1208;
                            if (--this.field1209 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1205 < var4) {
                                return;
                            }
                            this.field1205 = var4 + var4 - 1 - this.field1205;
                            this.field1208 = -this.field1208;
                            if (--this.field1209 == 0) {
                                break;
                            }
                            if (this.field1205 >= var3) {
                                return;
                            }
                            this.field1205 = var3 + var3 - 1 - this.field1205;
                            this.field1208 = -this.field1208;
                        } while (--this.field1209 != 0);
                    }
                } else if (this.field1208 < 0) {
                    if (this.field1205 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1205) / var6;
                    if (var7 < this.field1209) {
                        this.field1205 += var6 * var7;
                        this.field1209 -= var7;
                        return;
                    }
                    this.field1205 += this.field1209 * var6;
                    this.field1209 = 0;
                } else {
                    if (this.field1205 < var4) {
                        return;
                    }
                    int var8 = (this.field1205 - var3) / var6;
                    if (var8 < this.field1209) {
                        this.field1205 -= var6 * var8;
                        this.field1209 -= var8;
                        return;
                    }
                    this.field1205 -= this.field1209 * var6;
                    this.field1209 = 0;
                }
            }
            if (this.field1208 < 0) {
                if (this.field1205 < 0) {
                    this.field1205 = -1;
                    this.method424();
                    this.method768(-1);
                    return;
                }
            } else if (this.field1205 >= var5) {
                this.field1205 = var5;
                this.method424();
                this.method768(-1);
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([III)V")
    public final synchronized void method132(int[] arg0, int arg1, int arg2) {
        if (this.field1201 == 0 && this.field1202 == 0) {
            this.method114(arg2);
        } else {
            class117 var4 = (class117) super.field2959;
            int var5 = this.field1204 << 8;
            int var6 = this.field1198 << 8;
            int var7 = var4.field2711.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1209 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1205 < 0) {
                if (this.field1208 <= 0) {
                    this.method424();
                    this.method768(-1);
                    return;
                }
                this.field1205 = 0;
            }
            if (this.field1205 >= var7) {
                if (this.field1208 >= 0) {
                    this.method424();
                    this.method768(-1);
                    return;
                }
                this.field1205 = var7 - 1;
            }
            if (this.field1209 < 0) {
                if (this.field1207) {
                    if (this.field1208 < 0) {
                        var9 = this.method425(arg0, arg1, var5, var10, var4.field2711[this.field1204]);
                        if (this.field1205 >= var5) {
                            return;
                        }
                        this.field1205 = var5 + var5 - 1 - this.field1205;
                        this.field1208 = -this.field1208;
                    }
                    while (true) {
                        int var11 = this.method441(arg0, var9, var6, var10, var4.field2711[this.field1198 - 1]);
                        if (this.field1205 < var6) {
                            return;
                        }
                        this.field1205 = var6 + var6 - 1 - this.field1205;
                        this.field1208 = -this.field1208;
                        var9 = this.method425(arg0, var11, var5, var10, var4.field2711[this.field1204]);
                        if (this.field1205 >= var5) {
                            return;
                        }
                        this.field1205 = var5 + var5 - 1 - this.field1205;
                        this.field1208 = -this.field1208;
                    }
                } else if (this.field1208 < 0) {
                    while (true) {
                        var9 = this.method425(arg0, var9, var5, var10, var4.field2711[this.field1198 - 1]);
                        if (this.field1205 >= var5) {
                            return;
                        }
                        this.field1205 = var6 - 1 - (var6 - 1 - this.field1205) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method441(arg0, var9, var6, var10, var4.field2711[this.field1204]);
                        if (this.field1205 < var6) {
                            return;
                        }
                        this.field1205 = (this.field1205 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1209 > 0) {
                    if (this.field1207) {
                        label130: {
                            if (this.field1208 < 0) {
                                var9 = this.method425(arg0, arg1, var5, var10, var4.field2711[this.field1204]);
                                if (this.field1205 >= var5) {
                                    return;
                                }
                                this.field1205 = var5 + var5 - 1 - this.field1205;
                                this.field1208 = -this.field1208;
                                if (--this.field1209 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method441(arg0, var9, var6, var10, var4.field2711[this.field1198 - 1]);
                                if (this.field1205 < var6) {
                                    return;
                                }
                                this.field1205 = var6 + var6 - 1 - this.field1205;
                                this.field1208 = -this.field1208;
                                if (--this.field1209 == 0) {
                                    break;
                                }
                                var9 = this.method425(arg0, var9, var5, var10, var4.field2711[this.field1204]);
                                if (this.field1205 >= var5) {
                                    return;
                                }
                                this.field1205 = var5 + var5 - 1 - this.field1205;
                                this.field1208 = -this.field1208;
                            } while (--this.field1209 != 0);
                        }
                    } else if (this.field1208 < 0) {
                        while (true) {
                            var9 = this.method425(arg0, var9, var5, var10, var4.field2711[this.field1198 - 1]);
                            if (this.field1205 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1205) / var8;
                            if (var12 >= this.field1209) {
                                this.field1205 += this.field1209 * var8;
                                this.field1209 = 0;
                                break;
                            }
                            this.field1205 += var8 * var12;
                            this.field1209 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method441(arg0, var9, var6, var10, var4.field2711[this.field1204]);
                            if (this.field1205 < var6) {
                                return;
                            }
                            int var13 = (this.field1205 - var5) / var8;
                            if (var13 >= this.field1209) {
                                this.field1205 -= this.field1209 * var8;
                                this.field1209 = 0;
                                break;
                            }
                            this.field1205 -= var8 * var13;
                            this.field1209 -= var13;
                        }
                    }
                }
                if (this.field1208 < 0) {
                    this.method425(arg0, var9, 0, var10, 0);
                    if (this.field1205 < 0) {
                        this.field1205 = -1;
                        this.method424();
                        this.method768(-1);
                        return;
                    }
                } else {
                    this.method441(arg0, var9, var7, var10, 0);
                    if (this.field1205 >= var7) {
                        this.field1205 = var7;
                        this.method424();
                        this.method768(-1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "()I")
    public final int method419() {
        int var1 = this.field1210 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1209 == 0) {
            var2 -= this.field1205 * var2 / (((class117) super.field2959).field2711.length << 8);
        } else if (this.field1209 >= 0) {
            var2 -= this.field1204 * var2 / ((class117) super.field2959).field2711.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method420(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class50 arg11, int arg12, int arg13) {
        arg11.field1200 -= arg11.field1206 * arg5;
        arg11.field1212 -= arg11.field1211 * arg5;
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
        arg11.field1200 += arg11.field1206 * arg5;
        arg11.field1212 += arg11.field1211 * arg5;
        arg11.field1210 = arg6;
        arg11.field1205 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([B[IIIIIIILha;)I")
    private static final int method421(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class50 arg8) {
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
        arg8.field1205 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II)V")
    private final synchronized void method422(int arg0, int arg1) {
        this.field1201 = arg0;
        this.field1199 = arg1;
        this.field1202 = 0;
        this.method430();
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method423(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class50 arg11, int arg12, int arg13) {
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
        arg11.field1205 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "()V")
    private final void method424() {
        if (this.field1202 != 0) {
            if (this.field1201 == Integer.MIN_VALUE) {
                this.field1201 = 0;
            }
            this.field1202 = 0;
            this.method430();
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "([IIIII)I")
    private final int method425(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1202 <= 0) {
                if (this.field1208 == -256 && (this.field1205 & 255) == 0) {
                    if (class41.field972) {
                        return method443(0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, 0, arg3, arg2, this);
                    }
                    return method428(((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, 0, arg3, arg2, this);
                }
                if (class41.field972) {
                    return method423(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, 0, arg3, arg2, this, this.field1208, arg4);
                }
                return method433(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, 0, arg3, arg2, this, this.field1208, arg4);
            }
            int var6 = this.field1202 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1202 += arg1;
            if (this.field1208 == -256 && (this.field1205 & 255) == 0) {
                if (class41.field972) {
                    arg1 = method417(0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, this.field1206, this.field1211, 0, var6, arg2, this);
                } else {
                    arg1 = method447(((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, this.field1203, 0, var6, arg2, this);
                }
            } else if (class41.field972) {
                arg1 = method451(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, this.field1206, this.field1211, 0, var6, arg2, this, this.field1208, arg4);
            } else {
                arg1 = method444(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, this.field1203, 0, var6, arg2, this, this.field1208, arg4);
            }
            this.field1202 -= arg1;
            if (this.field1202 != 0) {
                return arg1;
            }
        } while (!this.method429());
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(II)I")
    private static final int method426(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
    public final synchronized void method427(int arg0) {
        this.method422(arg0 << 6, this.method446());
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "([B[IIIIIIILha;)I")
    private static final int method428(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class50 arg8) {
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
        arg8.field1205 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "()Z")
    private final boolean method429() {
        int var1 = this.field1201;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method431(var1, this.field1199);
            var2 = method426(var1, this.field1199);
        }
        if (this.field1210 == var1 && this.field1200 == var3 && this.field1212 == var2) {
            if (this.field1201 == Integer.MIN_VALUE) {
                this.field1201 = 0;
                this.field1210 = this.field1200 = this.field1212 = 0;
                this.method768(-1);
                return true;
            } else {
                this.method430();
                return false;
            }
        } else {
            if (this.field1210 < var1) {
                this.field1203 = 1;
                this.field1202 = var1 - this.field1210;
            } else if (this.field1210 > var1) {
                this.field1203 = -1;
                this.field1202 = this.field1210 - var1;
            } else {
                this.field1203 = 0;
            }
            if (this.field1200 < var3) {
                this.field1206 = 1;
                if (this.field1202 == 0 || this.field1202 > var3 - this.field1200) {
                    this.field1202 = var3 - this.field1200;
                }
            } else if (this.field1200 > var3) {
                this.field1206 = -1;
                if (this.field1202 == 0 || this.field1202 > this.field1200 - var3) {
                    this.field1202 = this.field1200 - var3;
                }
            } else {
                this.field1206 = 0;
            }
            if (this.field1212 < var2) {
                this.field1211 = 1;
                if (this.field1202 == 0 || this.field1202 > var2 - this.field1212) {
                    this.field1202 = var2 - this.field1212;
                }
            } else if (this.field1212 > var2) {
                this.field1211 = -1;
                if (this.field1202 == 0 || this.field1202 > this.field1212 - var2) {
                    this.field1202 = this.field1212 - var2;
                }
            } else {
                this.field1211 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "()V")
    private final void method430() {
        this.field1210 = this.field1201;
        this.field1200 = method431(this.field1201, this.field1199);
        this.field1212 = method426(this.field1201, this.field1199);
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II)I")
    private static final int method431(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Z)V")
    public final synchronized void method432(boolean arg0) {
        this.field1208 = (this.field1208 >>> 31) + (this.field1208 ^ this.field1208 >> 31);
        if (arg0) {
            this.field1208 = -this.field1208;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[B[IIIIIIILha;II)I")
    private static final int method433(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class50 arg10, int arg11, int arg12) {
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
        arg10.field1205 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(III)V")
    public final synchronized void method434(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method422(arg1, arg2);
        } else {
            int var4 = method431(arg1, arg2);
            int var5 = method426(arg1, arg2);
            if (this.field1200 == var4 && this.field1212 == var5) {
                this.field1202 = 0;
            } else {
                int var6 = arg1 - this.field1210;
                if (this.field1210 - arg1 > var6) {
                    var6 = this.field1210 - arg1;
                }
                if (var4 - this.field1200 > var6) {
                    var6 = var4 - this.field1200;
                }
                if (this.field1200 - var4 > var6) {
                    var6 = this.field1200 - var4;
                }
                if (var5 - this.field1212 > var6) {
                    var6 = var5 - this.field1212;
                }
                if (this.field1212 - var5 > var6) {
                    var6 = this.field1212 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1202 = arg0;
                this.field1201 = arg1;
                this.field1199 = arg2;
                this.field1203 = (arg1 - this.field1210) / arg0;
                this.field1206 = (var4 - this.field1200) / arg0;
                this.field1211 = (var5 - this.field1212) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "()I")
    public final synchronized int method435() {
        return this.field1201 == Integer.MIN_VALUE ? 0 : this.field1201;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II[B[IIIIIIIIIILha;II)I")
    private static final int method436(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class50 arg13, int arg14, int arg15) {
        arg13.field1210 -= arg13.field1203 * arg5;
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
        arg13.field1210 += arg13.field1203 * var22;
        arg13.field1200 = arg6;
        arg13.field1212 = arg7;
        arg13.field1205 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(II)V")
    public final synchronized void method437(int arg0, int arg1) {
        this.method434(arg0, arg1, this.method446());
    }

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)V")
    public final synchronized void method438(int arg0) {
        int var2 = ((class117) super.field2959).field2711.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1205 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II[B[IIIIIIILha;II)I")
    private static final int method439(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class50 arg10, int arg11, int arg12) {
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
        arg10.field1205 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "(I)V")
    public final synchronized void method440(int arg0) {
        if (arg0 == 0) {
            this.method418(0);
            this.method768(-1);
        } else if (this.field1200 == 0 && this.field1212 == 0) {
            this.field1202 = 0;
            this.field1201 = 0;
            this.field1210 = 0;
            this.method768(-1);
        } else {
            int var2 = -this.field1210;
            if (this.field1210 > var2) {
                var2 = this.field1210;
            }
            if (-this.field1200 > var2) {
                var2 = -this.field1200;
            }
            if (this.field1200 > var2) {
                var2 = this.field1200;
            }
            if (-this.field1212 > var2) {
                var2 = -this.field1212;
            }
            if (this.field1212 > var2) {
                var2 = this.field1212;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1202 = arg0;
            this.field1201 = Integer.MIN_VALUE;
            this.field1203 = -this.field1210 / arg0;
            this.field1206 = -this.field1200 / arg0;
            this.field1211 = -this.field1212 / arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "([IIIII)I")
    private final int method441(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1202 <= 0) {
                if (this.field1208 == 256 && (this.field1205 & 255) == 0) {
                    if (class41.field972) {
                        return method442(0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, 0, arg3, arg2, this);
                    }
                    return method421(((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, 0, arg3, arg2, this);
                }
                if (class41.field972) {
                    return method415(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, 0, arg3, arg2, this, this.field1208, arg4);
                }
                return method439(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, 0, arg3, arg2, this, this.field1208, arg4);
            }
            int var6 = this.field1202 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1202 += arg1;
            if (this.field1208 == 256 && (this.field1205 & 255) == 0) {
                if (class41.field972) {
                    arg1 = method454(0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, this.field1206, this.field1211, 0, var6, arg2, this);
                } else {
                    arg1 = method416(((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, this.field1203, 0, var6, arg2, this);
                }
            } else if (class41.field972) {
                arg1 = method436(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1200, this.field1212, this.field1206, this.field1211, 0, var6, arg2, this, this.field1208, arg4);
            } else {
                arg1 = method420(0, 0, ((class117) super.field2959).field2711, arg0, this.field1205, arg1, this.field1210, this.field1203, 0, var6, arg2, this, this.field1208, arg4);
            }
            this.field1202 -= arg1;
            if (this.field1202 != 0) {
                return arg1;
            }
        } while (!this.method429());
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I[B[IIIIIIIILha;)I")
    private static final int method442(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class50 arg10) {
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
        arg10.field1205 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I[B[IIIIIIIILha;)I")
    private static final int method443(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class50 arg10) {
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
        arg10.field1205 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "(II[B[IIIIIIIILha;II)I")
    private static final int method444(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class50 arg11, int arg12, int arg13) {
        arg11.field1200 -= arg11.field1206 * arg5;
        arg11.field1212 -= arg11.field1211 * arg5;
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
        arg11.field1200 += arg11.field1206 * arg5;
        arg11.field1212 += arg11.field1211 * arg5;
        arg11.field1210 = arg6;
        arg11.field1205 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "(I)V")
    public final synchronized void method445(int arg0) {
        if (this.field1208 < 0) {
            this.field1208 = -arg0;
        } else {
            this.field1208 = arg0;
        }
    }

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "()I")
    public final synchronized int method446() {
        return this.field1199 < 0 ? -1 : this.field1199;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "([B[IIIIIIIILha;)I")
    private static final int method447(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class50 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1200 += (var14 - arg3) * arg9.field1206;
        arg9.field1212 += (var14 - arg3) * arg9.field1211;
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
        arg9.field1210 = var12 >> 2;
        arg9.field1205 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "()I")
    public final int method133() {
        return this.field1201 == 0 && this.field1202 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "(I)V")
    public final synchronized void method448(int arg0) {
        this.field1209 = arg0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "()Lsd;")
    public final class129 method122() {
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqf;II)Lha;")
    public static final class50 method449(class117 arg0, int arg1, int arg2) {
        return arg0.field2711 != null && arg0.field2711.length != 0 ? new class50(arg0, (int) ((long) arg0.field2714 * 256L * (long) arg1 / (long) (class85.field2084 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "()Z")
    public final boolean method450() {
        return this.field1202 != 0;
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(II[B[IIIIIIIIIILha;II)I")
    private static final int method451(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class50 arg13, int arg14, int arg15) {
        arg13.field1210 -= arg13.field1203 * arg5;
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
        arg13.field1210 += arg13.field1203 * var22;
        arg13.field1200 = arg6;
        arg13.field1212 = arg7;
        arg13.field1205 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ha", name = "l", descriptor = "()I")
    public final synchronized int method452() {
        return this.field1208 < 0 ? -this.field1208 : this.field1208;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lqf;III)Lha;")
    public static final class50 method453(class117 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2711 != null && arg0.field2711.length != 0 ? new class50(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "()Lsd;")
    public final class129 method102() {
        return null;
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqf;II)V")
    private class50(class117 arg0, int arg1, int arg2) {
        super.field2959 = arg0;
        this.field1204 = arg0.field2710;
        this.field1198 = arg0.field2712;
        this.field1207 = arg0.field2713;
        this.field1208 = arg1;
        this.field1201 = arg2;
        this.field1199 = 8192;
        this.field1205 = 0;
        this.method430();
    }

    @OriginalMember(owner = "client!ha", name = "<init>", descriptor = "(Lqf;III)V")
    private class50(class117 arg0, int arg1, int arg2, int arg3) {
        super.field2959 = arg0;
        this.field1204 = arg0.field2710;
        this.field1198 = arg0.field2712;
        this.field1207 = arg0.field2713;
        this.field1208 = arg1;
        this.field1201 = arg2;
        this.field1199 = arg3;
        this.field1205 = 0;
        this.method430();
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I[B[IIIIIIIIIILha;)I")
    private static final int method454(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class50 arg12) {
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
        arg12.field1210 += (var19 - arg4) * arg12.field1203;
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
        arg12.field1200 = var15 >> 2;
        arg12.field1212 = var16 >> 2;
        arg12.field1205 = var13 << 8;
        return var20 >> 1;
    }
}
