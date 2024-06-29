import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class64 extends class208 {

    @OriginalMember(owner = "client!e", name = "C", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!e", name = "F", descriptor = "I")
    private int field1210;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "Z")
    private boolean field1205;

    @OriginalMember(owner = "client!e", name = "J", descriptor = "I")
    private int field1214;

    @OriginalMember(owner = "client!e", name = "H", descriptor = "I")
    private int field1212;

    @OriginalMember(owner = "client!e", name = "G", descriptor = "I")
    private int field1211;

    @OriginalMember(owner = "client!e", name = "E", descriptor = "I")
    private int field1209;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    private int field1204;

    @OriginalMember(owner = "client!e", name = "B", descriptor = "I")
    private int field1206;

    @OriginalMember(owner = "client!e", name = "D", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!e", name = "I", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!e", name = "K", descriptor = "I")
    private int field1215;

    @OriginalMember(owner = "client!e", name = "L", descriptor = "I")
    private int field1216;

    @OriginalMember(owner = "client!e", name = "M", descriptor = "I")
    private int field1217;

    @OriginalMember(owner = "client!e", name = "N", descriptor = "I")
    private int field1218;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[B[IIIIIIIIIILe;)I")
    private static final int method531(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class64 arg12) {
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
        arg12.field1216 += (var19 - arg4) * arg12.field1204;
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
        arg12.field1206 = var15 >> 2;
        arg12.field1208 = var16 >> 2;
        arg12.field1209 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
    public final int method457() {
        return this.field1212 == 0 && this.field1215 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    private final synchronized void method532(int arg0) {
        this.method546(arg0, this.method568());
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([B[IIIIIIIILe;)I")
    private static final int method533(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class64 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1206 += (var14 - arg3) * arg9.field1213;
        arg9.field1208 += (var14 - arg3) * arg9.field1218;
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
        arg9.field1216 = var12 >> 2;
        arg9.field1209 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[B[IIIIIIIILe;II)I")
    private static final int method534(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class64 arg11, int arg12, int arg13) {
        arg11.field1206 -= arg11.field1213 * arg5;
        arg11.field1208 -= arg11.field1218 * arg5;
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
        arg11.field1206 += arg11.field1213 * arg5;
        arg11.field1208 += arg11.field1218 * arg5;
        arg11.field1216 = arg6;
        arg11.field1209 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(I)V")
    public final synchronized void method535(int arg0) {
        this.field1217 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II[B[IIIIIIIILe;II)I")
    private static final int method536(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class64 arg11, int arg12, int arg13) {
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
        arg11.field1209 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lqa;II)Le;")
    public static final class64 method537(class148 arg0, int arg1, int arg2) {
        return arg0.field2660 != null && arg0.field2660.length != 0 ? new class64(arg0, (int) ((long) arg0.field2662 * 256L * (long) arg1 / (long) (class55.field1011 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([B[IIIIIIILe;)I")
    private static final int method538(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class64 arg8) {
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
        arg8.field1209 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "()Z")
    public final boolean method539() {
        return this.field1215 != 0;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I)V")
    public final synchronized void method464(int arg0) {
        if (this.field1215 > 0) {
            if (arg0 >= this.field1215) {
                if (this.field1212 == Integer.MIN_VALUE) {
                    this.field1212 = 0;
                    this.field1216 = this.field1206 = this.field1208 = 0;
                    this.method518(84);
                    arg0 = this.field1215;
                }
                this.field1215 = 0;
                this.method561();
            } else {
                this.field1216 += this.field1204 * arg0;
                this.field1206 += this.field1213 * arg0;
                this.field1208 += this.field1218 * arg0;
                this.field1215 -= arg0;
            }
        }
        class148 var2 = (class148) super.field3647;
        int var3 = this.field1207 << 8;
        int var4 = this.field1210 << 8;
        int var5 = var2.field2660.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1217 = 0;
        }
        if (this.field1209 < 0) {
            if (this.field1214 <= 0) {
                this.method560();
                this.method518(123);
                return;
            }
            this.field1209 = 0;
        }
        if (this.field1209 >= var5) {
            if (this.field1214 >= 0) {
                this.method560();
                this.method518(93);
                return;
            }
            this.field1209 = var5 - 1;
        }
        this.field1209 += this.field1214 * arg0;
        if (this.field1217 < 0) {
            if (!this.field1205) {
                if (this.field1214 < 0) {
                    if (this.field1209 < var3) {
                        this.field1209 = var4 - 1 - (var4 - 1 - this.field1209) % var6;
                    }
                } else if (this.field1209 >= var4) {
                    this.field1209 = (this.field1209 - var3) % var6 + var3;
                }
            } else {
                if (this.field1214 < 0) {
                    if (this.field1209 >= var3) {
                        return;
                    }
                    this.field1209 = var3 + var3 - 1 - this.field1209;
                    this.field1214 = -this.field1214;
                }
                while (this.field1209 >= var4) {
                    this.field1209 = var4 + var4 - 1 - this.field1209;
                    this.field1214 = -this.field1214;
                    if (this.field1209 >= var3) {
                        return;
                    }
                    this.field1209 = var3 + var3 - 1 - this.field1209;
                    this.field1214 = -this.field1214;
                }
            }
        } else {
            if (this.field1217 > 0) {
                if (this.field1205) {
                    label125: {
                        if (this.field1214 < 0) {
                            if (this.field1209 >= var3) {
                                return;
                            }
                            this.field1209 = var3 + var3 - 1 - this.field1209;
                            this.field1214 = -this.field1214;
                            if (--this.field1217 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1209 < var4) {
                                return;
                            }
                            this.field1209 = var4 + var4 - 1 - this.field1209;
                            this.field1214 = -this.field1214;
                            if (--this.field1217 == 0) {
                                break;
                            }
                            if (this.field1209 >= var3) {
                                return;
                            }
                            this.field1209 = var3 + var3 - 1 - this.field1209;
                            this.field1214 = -this.field1214;
                        } while (--this.field1217 != 0);
                    }
                } else if (this.field1214 < 0) {
                    if (this.field1209 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1209) / var6;
                    if (var7 < this.field1217) {
                        this.field1209 += var6 * var7;
                        this.field1217 -= var7;
                        return;
                    }
                    this.field1209 += this.field1217 * var6;
                    this.field1217 = 0;
                } else {
                    if (this.field1209 < var4) {
                        return;
                    }
                    int var8 = (this.field1209 - var3) / var6;
                    if (var8 < this.field1217) {
                        this.field1209 -= var6 * var8;
                        this.field1217 -= var8;
                        return;
                    }
                    this.field1209 -= this.field1217 * var6;
                    this.field1217 = 0;
                }
            }
            if (this.field1214 < 0) {
                if (this.field1209 < 0) {
                    this.field1209 = -1;
                    this.method560();
                    this.method518(100);
                    return;
                }
            } else if (this.field1209 >= var5) {
                this.field1209 = var5;
                this.method560();
                this.method518(84);
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I[B[IIIIIIIIIILe;)I")
    private static final int method540(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class64 arg12) {
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
        arg12.field1216 += (var19 - arg4) * arg12.field1204;
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
        arg12.field1206 = var15 >> 2;
        arg12.field1208 = var16 >> 2;
        arg12.field1209 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "()Z")
    public final boolean method541() {
        return this.field1209 < 0 || this.field1209 >= ((class148) super.field3647).field2660.length << 8;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "()I")
    public final synchronized int method542() {
        return this.field1214 < 0 ? -this.field1214 : this.field1214;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)V")
    public final synchronized void method543(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method546(arg1, arg2);
        } else {
            int var4 = method570(arg1, arg2);
            int var5 = method563(arg1, arg2);
            if (this.field1206 == var4 && this.field1208 == var5) {
                this.field1215 = 0;
            } else {
                int var6 = arg1 - this.field1216;
                if (this.field1216 - arg1 > var6) {
                    var6 = this.field1216 - arg1;
                }
                if (var4 - this.field1206 > var6) {
                    var6 = var4 - this.field1206;
                }
                if (this.field1206 - var4 > var6) {
                    var6 = this.field1206 - var4;
                }
                if (var5 - this.field1208 > var6) {
                    var6 = var5 - this.field1208;
                }
                if (this.field1208 - var5 > var6) {
                    var6 = this.field1208 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1215 = arg0;
                this.field1212 = arg1;
                this.field1211 = arg2;
                this.field1204 = (arg1 - this.field1216) / arg0;
                this.field1213 = (var4 - this.field1206) / arg0;
                this.field1218 = (var5 - this.field1208) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[B[IIIIIIILe;II)I")
    private static final int method544(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class64 arg10, int arg11, int arg12) {
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
        arg10.field1209 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
    public final synchronized void method545(boolean arg0) {
        this.field1214 = (this.field1214 >>> 31) + (this.field1214 ^ this.field1214 >> 31);
        if (arg0) {
            this.field1214 = -this.field1214;
        }
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(II)V")
    private final synchronized void method546(int arg0, int arg1) {
        this.field1212 = arg0;
        this.field1211 = arg1;
        this.field1215 = 0;
        this.method561();
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(II[B[IIIIIIIILe;II)I")
    private static final int method547(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class64 arg11, int arg12, int arg13) {
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
        arg11.field1209 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "([B[IIIIIIIILe;)I")
    private static final int method548(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class64 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1206 += (var14 - arg3) * arg9.field1213;
        arg9.field1208 += (var14 - arg3) * arg9.field1218;
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
        arg9.field1216 = var12 >> 2;
        arg9.field1209 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II[B[IIIIIIILe;II)I")
    private static final int method549(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class64 arg10, int arg11, int arg12) {
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
        arg10.field1209 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(I)V")
    public final synchronized void method550(int arg0) {
        if (this.field1214 < 0) {
            this.field1214 = -arg0;
        } else {
            this.field1214 = arg0;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([IIIII)I")
    private final int method551(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1215 <= 0) {
                if (this.field1214 == 256 && (this.field1209 & 255) == 0) {
                    if (class157.field2804) {
                        return method565(0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, 0, arg3, arg2, this);
                    }
                    return method538(((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, 0, arg3, arg2, this);
                }
                if (class157.field2804) {
                    return method536(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, 0, arg3, arg2, this, this.field1214, arg4);
                }
                return method544(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, 0, arg3, arg2, this, this.field1214, arg4);
            }
            int var6 = this.field1215 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1215 += arg1;
            if (this.field1214 == 256 && (this.field1209 & 255) == 0) {
                if (class157.field2804) {
                    arg1 = method531(0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, this.field1213, this.field1218, 0, var6, arg2, this);
                } else {
                    arg1 = method533(((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, this.field1204, 0, var6, arg2, this);
                }
            } else if (class157.field2804) {
                arg1 = method566(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, this.field1213, this.field1218, 0, var6, arg2, this, this.field1214, arg4);
            } else {
                arg1 = method556(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, this.field1204, 0, var6, arg2, this, this.field1214, arg4);
            }
            this.field1215 -= arg1;
            if (this.field1215 != 0) {
                return arg1;
            }
        } while (!this.method562());
        return arg3;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "()Lck;")
    public final class208 method454() {
        return null;
    }

    @OriginalMember(owner = "client!e", name = "e", descriptor = "(II)V")
    public final synchronized void method552(int arg0, int arg1) {
        this.method543(arg0, arg1, this.method568());
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
    public final int method553() {
        int var1 = this.field1216 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1217 == 0) {
            var2 -= this.field1209 * var2 / (((class148) super.field3647).field2660.length << 8);
        } else if (this.field1217 >= 0) {
            var2 -= this.field1207 * var2 / ((class148) super.field3647).field2660.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I[B[IIIIIIIILe;)I")
    private static final int method554(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class64 arg10) {
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
        arg10.field1209 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "([B[IIIIIIILe;)I")
    private static final int method555(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class64 arg8) {
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
        arg8.field1209 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!e", name = "d", descriptor = "(II[B[IIIIIIIILe;II)I")
    private static final int method556(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class64 arg11, int arg12, int arg13) {
        arg11.field1206 -= arg11.field1213 * arg5;
        arg11.field1208 -= arg11.field1218 * arg5;
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
        arg11.field1206 += arg11.field1213 * arg5;
        arg11.field1208 += arg11.field1218 * arg5;
        arg11.field1216 = arg6;
        arg11.field1209 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V")
    public final synchronized void method557(int arg0) {
        int var2 = ((class148) super.field3647).field2660.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1209 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "([IIIII)I")
    private final int method558(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1215 <= 0) {
                if (this.field1214 == -256 && (this.field1209 & 255) == 0) {
                    if (class157.field2804) {
                        return method554(0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, 0, arg3, arg2, this);
                    }
                    return method555(((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, 0, arg3, arg2, this);
                }
                if (class157.field2804) {
                    return method547(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, 0, arg3, arg2, this, this.field1214, arg4);
                }
                return method549(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, 0, arg3, arg2, this, this.field1214, arg4);
            }
            int var6 = this.field1215 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1215 += arg1;
            if (this.field1214 == -256 && (this.field1209 & 255) == 0) {
                if (class157.field2804) {
                    arg1 = method540(0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, this.field1213, this.field1218, 0, var6, arg2, this);
                } else {
                    arg1 = method548(((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, this.field1204, 0, var6, arg2, this);
                }
            } else if (class157.field2804) {
                arg1 = method559(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1206, this.field1208, this.field1213, this.field1218, 0, var6, arg2, this, this.field1214, arg4);
            } else {
                arg1 = method534(0, 0, ((class148) super.field3647).field2660, arg0, this.field1209, arg1, this.field1216, this.field1204, 0, var6, arg2, this, this.field1214, arg4);
            }
            this.field1215 -= arg1;
            if (this.field1215 != 0) {
                return arg1;
            }
        } while (!this.method562());
        return arg3;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II[B[IIIIIIIIIILe;II)I")
    private static final int method559(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class64 arg13, int arg14, int arg15) {
        arg13.field1216 -= arg13.field1204 * arg5;
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
        arg13.field1216 += arg13.field1204 * var22;
        arg13.field1206 = arg6;
        arg13.field1208 = arg7;
        arg13.field1209 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "()V")
    private final void method560() {
        if (this.field1215 != 0) {
            if (this.field1212 == Integer.MIN_VALUE) {
                this.field1212 = 0;
            }
            this.field1215 = 0;
            this.method561();
        }
    }

    @OriginalMember(owner = "client!e", name = "i", descriptor = "()V")
    private final void method561() {
        this.field1216 = this.field1212;
        this.field1206 = method570(this.field1212, this.field1211);
        this.field1208 = method563(this.field1212, this.field1211);
    }

    @OriginalMember(owner = "client!e", name = "j", descriptor = "()Z")
    private final boolean method562() {
        int var1 = this.field1212;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method570(var1, this.field1211);
            var2 = method563(var1, this.field1211);
        }
        if (this.field1216 == var1 && this.field1206 == var3 && this.field1208 == var2) {
            if (this.field1212 == Integer.MIN_VALUE) {
                this.field1212 = 0;
                this.field1216 = this.field1206 = this.field1208 = 0;
                this.method518(123);
                return true;
            } else {
                this.method561();
                return false;
            }
        } else {
            if (this.field1216 < var1) {
                this.field1204 = 1;
                this.field1215 = var1 - this.field1216;
            } else if (this.field1216 > var1) {
                this.field1204 = -1;
                this.field1215 = this.field1216 - var1;
            } else {
                this.field1204 = 0;
            }
            if (this.field1206 < var3) {
                this.field1213 = 1;
                if (this.field1215 == 0 || this.field1215 > var3 - this.field1206) {
                    this.field1215 = var3 - this.field1206;
                }
            } else if (this.field1206 > var3) {
                this.field1213 = -1;
                if (this.field1215 == 0 || this.field1215 > this.field1206 - var3) {
                    this.field1215 = this.field1206 - var3;
                }
            } else {
                this.field1213 = 0;
            }
            if (this.field1208 < var2) {
                this.field1218 = 1;
                if (this.field1215 == 0 || this.field1215 > var2 - this.field1208) {
                    this.field1215 = var2 - this.field1208;
                }
            } else if (this.field1208 > var2) {
                this.field1218 = -1;
                if (this.field1215 == 0 || this.field1215 > this.field1208 - var2) {
                    this.field1215 = this.field1208 - var2;
                }
            } else {
                this.field1218 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(II)I")
    private static final int method563(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Lqa;III)Le;")
    public static final class64 method564(class148 arg0, int arg1, int arg2, int arg3) {
        return arg0.field2660 != null && arg0.field2660.length != 0 ? new class64(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(I[B[IIIIIIIILe;)I")
    private static final int method565(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class64 arg10) {
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
        arg10.field1209 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "([III)V")
    public final synchronized void method441(int[] arg0, int arg1, int arg2) {
        if (this.field1212 == 0 && this.field1215 == 0) {
            this.method464(arg2);
        } else {
            class148 var4 = (class148) super.field3647;
            int var5 = this.field1207 << 8;
            int var6 = this.field1210 << 8;
            int var7 = var4.field2660.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1217 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1209 < 0) {
                if (this.field1214 <= 0) {
                    this.method560();
                    this.method518(98);
                    return;
                }
                this.field1209 = 0;
            }
            if (this.field1209 >= var7) {
                if (this.field1214 >= 0) {
                    this.method560();
                    this.method518(123);
                    return;
                }
                this.field1209 = var7 - 1;
            }
            if (this.field1217 < 0) {
                if (this.field1205) {
                    if (this.field1214 < 0) {
                        var9 = this.method558(arg0, arg1, var5, var10, var4.field2660[this.field1207]);
                        if (this.field1209 >= var5) {
                            return;
                        }
                        this.field1209 = var5 + var5 - 1 - this.field1209;
                        this.field1214 = -this.field1214;
                    }
                    while (true) {
                        int var11 = this.method551(arg0, var9, var6, var10, var4.field2660[this.field1210 - 1]);
                        if (this.field1209 < var6) {
                            return;
                        }
                        this.field1209 = var6 + var6 - 1 - this.field1209;
                        this.field1214 = -this.field1214;
                        var9 = this.method558(arg0, var11, var5, var10, var4.field2660[this.field1207]);
                        if (this.field1209 >= var5) {
                            return;
                        }
                        this.field1209 = var5 + var5 - 1 - this.field1209;
                        this.field1214 = -this.field1214;
                    }
                } else if (this.field1214 < 0) {
                    while (true) {
                        var9 = this.method558(arg0, var9, var5, var10, var4.field2660[this.field1210 - 1]);
                        if (this.field1209 >= var5) {
                            return;
                        }
                        this.field1209 = var6 - 1 - (var6 - 1 - this.field1209) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method551(arg0, var9, var6, var10, var4.field2660[this.field1207]);
                        if (this.field1209 < var6) {
                            return;
                        }
                        this.field1209 = (this.field1209 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1217 > 0) {
                    if (this.field1205) {
                        label130: {
                            if (this.field1214 < 0) {
                                var9 = this.method558(arg0, arg1, var5, var10, var4.field2660[this.field1207]);
                                if (this.field1209 >= var5) {
                                    return;
                                }
                                this.field1209 = var5 + var5 - 1 - this.field1209;
                                this.field1214 = -this.field1214;
                                if (--this.field1217 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method551(arg0, var9, var6, var10, var4.field2660[this.field1210 - 1]);
                                if (this.field1209 < var6) {
                                    return;
                                }
                                this.field1209 = var6 + var6 - 1 - this.field1209;
                                this.field1214 = -this.field1214;
                                if (--this.field1217 == 0) {
                                    break;
                                }
                                var9 = this.method558(arg0, var9, var5, var10, var4.field2660[this.field1207]);
                                if (this.field1209 >= var5) {
                                    return;
                                }
                                this.field1209 = var5 + var5 - 1 - this.field1209;
                                this.field1214 = -this.field1214;
                            } while (--this.field1217 != 0);
                        }
                    } else if (this.field1214 < 0) {
                        while (true) {
                            var9 = this.method558(arg0, var9, var5, var10, var4.field2660[this.field1210 - 1]);
                            if (this.field1209 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1209) / var8;
                            if (var12 >= this.field1217) {
                                this.field1209 += this.field1217 * var8;
                                this.field1217 = 0;
                                break;
                            }
                            this.field1209 += var8 * var12;
                            this.field1217 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method551(arg0, var9, var6, var10, var4.field2660[this.field1207]);
                            if (this.field1209 < var6) {
                                return;
                            }
                            int var13 = (this.field1209 - var5) / var8;
                            if (var13 >= this.field1217) {
                                this.field1209 -= this.field1217 * var8;
                                this.field1217 = 0;
                                break;
                            }
                            this.field1209 -= var8 * var13;
                            this.field1217 -= var13;
                        }
                    }
                }
                if (this.field1214 < 0) {
                    this.method558(arg0, var9, 0, var10, 0);
                    if (this.field1209 < 0) {
                        this.field1209 = -1;
                        this.method560();
                        this.method518(116);
                        return;
                    }
                } else {
                    this.method551(arg0, var9, var7, var10, 0);
                    if (this.field1209 >= var7) {
                        this.field1209 = var7;
                        this.method560();
                        this.method518(103);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II[B[IIIIIIIIIILe;II)I")
    private static final int method566(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class64 arg13, int arg14, int arg15) {
        arg13.field1216 -= arg13.field1204 * arg5;
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
        arg13.field1216 += arg13.field1204 * var22;
        arg13.field1206 = arg6;
        arg13.field1208 = arg7;
        arg13.field1209 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V")
    public final synchronized void method567(int arg0) {
        if (arg0 == 0) {
            this.method532(0);
            this.method518(96);
        } else if (this.field1206 == 0 && this.field1208 == 0) {
            this.field1215 = 0;
            this.field1212 = 0;
            this.field1216 = 0;
            this.method518(105);
        } else {
            int var2 = -this.field1216;
            if (this.field1216 > var2) {
                var2 = this.field1216;
            }
            if (-this.field1206 > var2) {
                var2 = -this.field1206;
            }
            if (this.field1206 > var2) {
                var2 = this.field1206;
            }
            if (-this.field1208 > var2) {
                var2 = -this.field1208;
            }
            if (this.field1208 > var2) {
                var2 = this.field1208;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1215 = arg0;
            this.field1212 = Integer.MIN_VALUE;
            this.field1204 = -this.field1216 / arg0;
            this.field1213 = -this.field1206 / arg0;
            this.field1218 = -this.field1208 / arg0;
        }
    }

    @OriginalMember(owner = "client!e", name = "k", descriptor = "()I")
    public final synchronized int method568() {
        return this.field1211 < 0 ? -1 : this.field1211;
    }

    @OriginalMember(owner = "client!e", name = "l", descriptor = "()I")
    public final synchronized int method569() {
        return this.field1212 == Integer.MIN_VALUE ? 0 : this.field1212;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(II)I")
    private static final int method570(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "()Lck;")
    public final class208 method437() {
        return null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lqa;II)V")
    private class64(class148 arg0, int arg1, int arg2) {
        super.field3647 = arg0;
        this.field1207 = arg0.field2659;
        this.field1210 = arg0.field2663;
        this.field1205 = arg0.field2661;
        this.field1214 = arg1;
        this.field1212 = arg2;
        this.field1211 = 8192;
        this.field1209 = 0;
        this.method561();
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lqa;III)V")
    private class64(class148 arg0, int arg1, int arg2, int arg3) {
        super.field3647 = arg0;
        this.field1207 = arg0.field2659;
        this.field1210 = arg0.field2663;
        this.field1205 = arg0.field2661;
        this.field1214 = arg1;
        this.field1212 = arg2;
        this.field1211 = arg3;
        this.field1209 = 0;
        this.method561();
    }

    @OriginalMember(owner = "client!e", name = "h", descriptor = "(I)V")
    public final synchronized void method571(int arg0) {
        this.method546(arg0 << 6, this.method568());
    }
}
