import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class180 extends class224 {

    @OriginalMember(owner = "client!ii", name = "v", descriptor = "I")
    private int field3199;

    @OriginalMember(owner = "client!ii", name = "z", descriptor = "I")
    private int field3203;

    @OriginalMember(owner = "client!ii", name = "A", descriptor = "Z")
    private boolean field3204;

    @OriginalMember(owner = "client!ii", name = "t", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!ii", name = "B", descriptor = "I")
    private int field3205;

    @OriginalMember(owner = "client!ii", name = "u", descriptor = "I")
    private int field3198;

    @OriginalMember(owner = "client!ii", name = "C", descriptor = "I")
    private int field3206;

    @OriginalMember(owner = "client!ii", name = "s", descriptor = "I")
    private int field3196;

    @OriginalMember(owner = "client!ii", name = "w", descriptor = "I")
    private int field3200;

    @OriginalMember(owner = "client!ii", name = "x", descriptor = "I")
    private int field3201;

    @OriginalMember(owner = "client!ii", name = "y", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!ii", name = "D", descriptor = "I")
    private int field3207;

    @OriginalMember(owner = "client!ii", name = "E", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!ii", name = "F", descriptor = "I")
    private int field3209;

    @OriginalMember(owner = "client!ii", name = "G", descriptor = "I")
    private int field3210;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public final synchronized void method1168(boolean arg0) {
        this.field3197 = (this.field3197 >>> 31) + (this.field3197 ^ this.field3197 >> 31);
        if (arg0) {
            this.field3197 = -this.field3197;
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "(I)V")
    public final synchronized void method1169(int arg0) {
        if (arg0 == 0) {
            this.method1182(0);
            this.method97(158);
        } else if (this.field3201 == 0 && this.field3207 == 0) {
            this.field3200 = 0;
            this.field3205 = 0;
            this.field3202 = 0;
            this.method97(158);
        } else {
            int var2 = -this.field3202;
            if (this.field3202 > var2) {
                var2 = this.field3202;
            }
            if (-this.field3201 > var2) {
                var2 = -this.field3201;
            }
            if (this.field3201 > var2) {
                var2 = this.field3201;
            }
            if (-this.field3207 > var2) {
                var2 = -this.field3207;
            }
            if (this.field3207 > var2) {
                var2 = this.field3207;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field3200 = arg0;
            this.field3205 = Integer.MIN_VALUE;
            this.field3209 = -this.field3202 / arg0;
            this.field3210 = -this.field3201 / arg0;
            this.field3196 = -this.field3207 / arg0;
        }
    }

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "()Z")
    public final boolean method1170() {
        return this.field3200 != 0;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "(I)V")
    public final synchronized void method1171(int arg0) {
        if (this.field3197 < 0) {
            this.field3197 = -arg0;
        } else {
            this.field3197 = arg0;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II)I")
    private static final int method1172(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[B[IIIIIIILii;II)I")
    private static final int method1173(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10, int arg11, int arg12) {
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
        arg10.field3206 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "()Lvg;")
    public final class224 method182() {
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "(I)V")
    public final synchronized void method1174(int arg0) {
        int var2 = ((class222) super.field3990).field3974.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field3206 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[B[IIIIIIIIIILii;II)I")
    private static final int method1175(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class180 arg13, int arg14, int arg15) {
        arg13.field3202 -= arg13.field3209 * arg5;
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
        arg13.field3202 += arg13.field3209 * var22;
        arg13.field3201 = arg6;
        arg13.field3207 = arg7;
        arg13.field3206 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II[B[IIIIIIILii;II)I")
    private static final int method1176(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10, int arg11, int arg12) {
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
        arg10.field3206 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(I)V")
    public final synchronized void method208(int arg0) {
        if (this.field3200 > 0) {
            if (arg0 >= this.field3200) {
                if (this.field3205 == Integer.MIN_VALUE) {
                    this.field3205 = 0;
                    this.field3202 = this.field3201 = this.field3207 = 0;
                    this.method97(158);
                    arg0 = this.field3200;
                }
                this.field3200 = 0;
                this.method1180();
            } else {
                this.field3202 += this.field3209 * arg0;
                this.field3201 += this.field3210 * arg0;
                this.field3207 += this.field3196 * arg0;
                this.field3200 -= arg0;
            }
        }
        class222 var2 = (class222) super.field3990;
        int var3 = this.field3199 << 8;
        int var4 = this.field3203 << 8;
        int var5 = var2.field3974.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field3208 = 0;
        }
        if (this.field3206 < 0) {
            if (this.field3197 <= 0) {
                this.method1188();
                this.method97(158);
                return;
            }
            this.field3206 = 0;
        }
        if (this.field3206 >= var5) {
            if (this.field3197 >= 0) {
                this.method1188();
                this.method97(158);
                return;
            }
            this.field3206 = var5 - 1;
        }
        this.field3206 += this.field3197 * arg0;
        if (this.field3208 < 0) {
            if (!this.field3204) {
                if (this.field3197 < 0) {
                    if (this.field3206 < var3) {
                        this.field3206 = var4 - 1 - (var4 - 1 - this.field3206) % var6;
                    }
                } else if (this.field3206 >= var4) {
                    this.field3206 = (this.field3206 - var3) % var6 + var3;
                }
            } else {
                if (this.field3197 < 0) {
                    if (this.field3206 >= var3) {
                        return;
                    }
                    this.field3206 = var3 + var3 - 1 - this.field3206;
                    this.field3197 = -this.field3197;
                }
                while (this.field3206 >= var4) {
                    this.field3206 = var4 + var4 - 1 - this.field3206;
                    this.field3197 = -this.field3197;
                    if (this.field3206 >= var3) {
                        return;
                    }
                    this.field3206 = var3 + var3 - 1 - this.field3206;
                    this.field3197 = -this.field3197;
                }
            }
        } else {
            if (this.field3208 > 0) {
                if (this.field3204) {
                    label125: {
                        if (this.field3197 < 0) {
                            if (this.field3206 >= var3) {
                                return;
                            }
                            this.field3206 = var3 + var3 - 1 - this.field3206;
                            this.field3197 = -this.field3197;
                            if (--this.field3208 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field3206 < var4) {
                                return;
                            }
                            this.field3206 = var4 + var4 - 1 - this.field3206;
                            this.field3197 = -this.field3197;
                            if (--this.field3208 == 0) {
                                break;
                            }
                            if (this.field3206 >= var3) {
                                return;
                            }
                            this.field3206 = var3 + var3 - 1 - this.field3206;
                            this.field3197 = -this.field3197;
                        } while (--this.field3208 != 0);
                    }
                } else if (this.field3197 < 0) {
                    if (this.field3206 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field3206) / var6;
                    if (var7 < this.field3208) {
                        this.field3206 += var6 * var7;
                        this.field3208 -= var7;
                        return;
                    }
                    this.field3206 += this.field3208 * var6;
                    this.field3208 = 0;
                } else {
                    if (this.field3206 < var4) {
                        return;
                    }
                    int var8 = (this.field3206 - var3) / var6;
                    if (var8 < this.field3208) {
                        this.field3206 -= var6 * var8;
                        this.field3208 -= var8;
                        return;
                    }
                    this.field3206 -= this.field3208 * var6;
                    this.field3208 = 0;
                }
            }
            if (this.field3197 < 0) {
                if (this.field3206 < 0) {
                    this.field3206 = -1;
                    this.method1188();
                    this.method97(158);
                    return;
                }
            } else if (this.field3206 >= var5) {
                this.field3206 = var5;
                this.method1188();
                this.method97(158);
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([IIIII)I")
    private final int method1177(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3200 <= 0) {
                if (this.field3197 == -256 && (this.field3206 & 255) == 0) {
                    if (class51.field1080) {
                        return method1207(0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, 0, arg3, arg2, this);
                    }
                    return method1181(((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, 0, arg3, arg2, this);
                }
                if (class51.field1080) {
                    return method1179(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, 0, arg3, arg2, this, this.field3197, arg4);
                }
                return method1173(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, 0, arg3, arg2, this, this.field3197, arg4);
            }
            int var6 = this.field3200 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3200 += arg1;
            if (this.field3197 == -256 && (this.field3206 & 255) == 0) {
                if (class51.field1080) {
                    arg1 = method1191(0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, this.field3210, this.field3196, 0, var6, arg2, this);
                } else {
                    arg1 = method1198(((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, this.field3209, 0, var6, arg2, this);
                }
            } else if (class51.field1080) {
                arg1 = method1189(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, this.field3210, this.field3196, 0, var6, arg2, this, this.field3197, arg4);
            } else {
                arg1 = method1185(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, this.field3209, 0, var6, arg2, this, this.field3197, arg4);
            }
            this.field3200 -= arg1;
            if (this.field3200 != 0) {
                return arg1;
            }
        } while (!this.method1187());
        return arg3;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([IIIII)I")
    private final int method1178(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field3200 <= 0) {
                if (this.field3197 == 256 && (this.field3206 & 255) == 0) {
                    if (class51.field1080) {
                        return method1197(0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, 0, arg3, arg2, this);
                    }
                    return method1204(((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, 0, arg3, arg2, this);
                }
                if (class51.field1080) {
                    return method1190(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, 0, arg3, arg2, this, this.field3197, arg4);
                }
                return method1176(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, 0, arg3, arg2, this, this.field3197, arg4);
            }
            int var6 = this.field3200 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field3200 += arg1;
            if (this.field3197 == 256 && (this.field3206 & 255) == 0) {
                if (class51.field1080) {
                    arg1 = method1184(0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, this.field3210, this.field3196, 0, var6, arg2, this);
                } else {
                    arg1 = method1196(((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, this.field3209, 0, var6, arg2, this);
                }
            } else if (class51.field1080) {
                arg1 = method1175(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3201, this.field3207, this.field3210, this.field3196, 0, var6, arg2, this, this.field3197, arg4);
            } else {
                arg1 = method1192(0, 0, ((class222) super.field3990).field3974, arg0, this.field3206, arg1, this.field3202, this.field3209, 0, var6, arg2, this, this.field3197, arg4);
            }
            this.field3200 -= arg1;
            if (this.field3200 != 0) {
                return arg1;
            }
        } while (!this.method1187());
        return arg3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(II[B[IIIIIIIILii;II)I")
    private static final int method1179(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
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
        arg11.field3206 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "()V")
    private final void method1180() {
        this.field3202 = this.field3205;
        this.field3201 = method1172(this.field3205, this.field3198);
        this.field3207 = method1195(this.field3205, this.field3198);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([B[IIIIIIILii;)I")
    private static final int method1181(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class180 arg8) {
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
        arg8.field3206 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "(I)V")
    private final synchronized void method1182(int arg0) {
        this.method1199(arg0, this.method1186());
    }

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "(I)V")
    public final synchronized void method1183(int arg0) {
        this.method1199(arg0 << 6, this.method1186());
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([III)V")
    public final synchronized void method192(int[] arg0, int arg1, int arg2) {
        if (this.field3205 == 0 && this.field3200 == 0) {
            this.method208(arg2);
        } else {
            class222 var4 = (class222) super.field3990;
            int var5 = this.field3199 << 8;
            int var6 = this.field3203 << 8;
            int var7 = var4.field3974.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field3208 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field3206 < 0) {
                if (this.field3197 <= 0) {
                    this.method1188();
                    this.method97(158);
                    return;
                }
                this.field3206 = 0;
            }
            if (this.field3206 >= var7) {
                if (this.field3197 >= 0) {
                    this.method1188();
                    this.method97(158);
                    return;
                }
                this.field3206 = var7 - 1;
            }
            if (this.field3208 < 0) {
                if (this.field3204) {
                    if (this.field3197 < 0) {
                        var9 = this.method1177(arg0, arg1, var5, var10, var4.field3974[this.field3199]);
                        if (this.field3206 >= var5) {
                            return;
                        }
                        this.field3206 = var5 + var5 - 1 - this.field3206;
                        this.field3197 = -this.field3197;
                    }
                    while (true) {
                        int var11 = this.method1178(arg0, var9, var6, var10, var4.field3974[this.field3203 - 1]);
                        if (this.field3206 < var6) {
                            return;
                        }
                        this.field3206 = var6 + var6 - 1 - this.field3206;
                        this.field3197 = -this.field3197;
                        var9 = this.method1177(arg0, var11, var5, var10, var4.field3974[this.field3199]);
                        if (this.field3206 >= var5) {
                            return;
                        }
                        this.field3206 = var5 + var5 - 1 - this.field3206;
                        this.field3197 = -this.field3197;
                    }
                } else if (this.field3197 < 0) {
                    while (true) {
                        var9 = this.method1177(arg0, var9, var5, var10, var4.field3974[this.field3203 - 1]);
                        if (this.field3206 >= var5) {
                            return;
                        }
                        this.field3206 = var6 - 1 - (var6 - 1 - this.field3206) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method1178(arg0, var9, var6, var10, var4.field3974[this.field3199]);
                        if (this.field3206 < var6) {
                            return;
                        }
                        this.field3206 = (this.field3206 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field3208 > 0) {
                    if (this.field3204) {
                        label130: {
                            if (this.field3197 < 0) {
                                var9 = this.method1177(arg0, arg1, var5, var10, var4.field3974[this.field3199]);
                                if (this.field3206 >= var5) {
                                    return;
                                }
                                this.field3206 = var5 + var5 - 1 - this.field3206;
                                this.field3197 = -this.field3197;
                                if (--this.field3208 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method1178(arg0, var9, var6, var10, var4.field3974[this.field3203 - 1]);
                                if (this.field3206 < var6) {
                                    return;
                                }
                                this.field3206 = var6 + var6 - 1 - this.field3206;
                                this.field3197 = -this.field3197;
                                if (--this.field3208 == 0) {
                                    break;
                                }
                                var9 = this.method1177(arg0, var9, var5, var10, var4.field3974[this.field3199]);
                                if (this.field3206 >= var5) {
                                    return;
                                }
                                this.field3206 = var5 + var5 - 1 - this.field3206;
                                this.field3197 = -this.field3197;
                            } while (--this.field3208 != 0);
                        }
                    } else if (this.field3197 < 0) {
                        while (true) {
                            var9 = this.method1177(arg0, var9, var5, var10, var4.field3974[this.field3203 - 1]);
                            if (this.field3206 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field3206) / var8;
                            if (var12 >= this.field3208) {
                                this.field3206 += this.field3208 * var8;
                                this.field3208 = 0;
                                break;
                            }
                            this.field3206 += var8 * var12;
                            this.field3208 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method1178(arg0, var9, var6, var10, var4.field3974[this.field3199]);
                            if (this.field3206 < var6) {
                                return;
                            }
                            int var13 = (this.field3206 - var5) / var8;
                            if (var13 >= this.field3208) {
                                this.field3206 -= this.field3208 * var8;
                                this.field3208 = 0;
                                break;
                            }
                            this.field3206 -= var8 * var13;
                            this.field3208 -= var13;
                        }
                    }
                }
                if (this.field3197 < 0) {
                    this.method1177(arg0, var9, 0, var10, 0);
                    if (this.field3206 < 0) {
                        this.field3206 = -1;
                        this.method1188();
                        this.method97(158);
                        return;
                    }
                } else {
                    this.method1178(arg0, var9, var7, var10, 0);
                    if (this.field3206 >= var7) {
                        this.field3206 = var7;
                        this.method1188();
                        this.method97(158);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B[IIIIIIIIIILii;)I")
    private static final int method1184(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class180 arg12) {
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
        arg12.field3202 += (var19 - arg4) * arg12.field3209;
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
        arg12.field3201 = var15 >> 2;
        arg12.field3207 = var16 >> 2;
        arg12.field3206 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II[B[IIIIIIIILii;II)I")
    private static final int method1185(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
        arg11.field3201 -= arg11.field3210 * arg5;
        arg11.field3207 -= arg11.field3196 * arg5;
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
        arg11.field3201 += arg11.field3210 * arg5;
        arg11.field3207 += arg11.field3196 * arg5;
        arg11.field3202 = arg6;
        arg11.field3206 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "()I")
    public final synchronized int method1186() {
        return this.field3198 < 0 ? -1 : this.field3198;
    }

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "()Z")
    private final boolean method1187() {
        int var1 = this.field3205;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method1172(var1, this.field3198);
            var2 = method1195(var1, this.field3198);
        }
        if (this.field3202 == var1 && this.field3201 == var3 && this.field3207 == var2) {
            if (this.field3205 == Integer.MIN_VALUE) {
                this.field3205 = 0;
                this.field3202 = this.field3201 = this.field3207 = 0;
                this.method97(158);
                return true;
            } else {
                this.method1180();
                return false;
            }
        } else {
            if (this.field3202 < var1) {
                this.field3209 = 1;
                this.field3200 = var1 - this.field3202;
            } else if (this.field3202 > var1) {
                this.field3209 = -1;
                this.field3200 = this.field3202 - var1;
            } else {
                this.field3209 = 0;
            }
            if (this.field3201 < var3) {
                this.field3210 = 1;
                if (this.field3200 == 0 || this.field3200 > var3 - this.field3201) {
                    this.field3200 = var3 - this.field3201;
                }
            } else if (this.field3201 > var3) {
                this.field3210 = -1;
                if (this.field3200 == 0 || this.field3200 > this.field3201 - var3) {
                    this.field3200 = this.field3201 - var3;
                }
            } else {
                this.field3210 = 0;
            }
            if (this.field3207 < var2) {
                this.field3196 = 1;
                if (this.field3200 == 0 || this.field3200 > var2 - this.field3207) {
                    this.field3200 = var2 - this.field3207;
                }
            } else if (this.field3207 > var2) {
                this.field3196 = -1;
                if (this.field3200 == 0 || this.field3200 > this.field3207 - var2) {
                    this.field3200 = this.field3207 - var2;
                }
            } else {
                this.field3196 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "()V")
    private final void method1188() {
        if (this.field3200 != 0) {
            if (this.field3205 == Integer.MIN_VALUE) {
                this.field3205 = 0;
            }
            this.field3200 = 0;
            this.method1180();
        }
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II[B[IIIIIIIIIILii;II)I")
    private static final int method1189(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class180 arg13, int arg14, int arg15) {
        arg13.field3202 -= arg13.field3209 * arg5;
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
        arg13.field3202 += arg13.field3209 * var22;
        arg13.field3201 = arg6;
        arg13.field3207 = arg7;
        arg13.field3206 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II[B[IIIIIIIILii;II)I")
    private static final int method1190(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
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
        arg11.field3206 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I[B[IIIIIIIIIILii;)I")
    private static final int method1191(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class180 arg12) {
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
        arg12.field3202 += (var19 - arg4) * arg12.field3209;
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
        arg12.field3201 = var15 >> 2;
        arg12.field3207 = var16 >> 2;
        arg12.field3206 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(II[B[IIIIIIIILii;II)I")
    private static final int method1192(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class180 arg11, int arg12, int arg13) {
        arg11.field3201 -= arg11.field3210 * arg5;
        arg11.field3207 -= arg11.field3196 * arg5;
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
        arg11.field3201 += arg11.field3210 * arg5;
        arg11.field3207 += arg11.field3196 * arg5;
        arg11.field3202 = arg6;
        arg11.field3206 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "()I")
    public final synchronized int method1193() {
        return this.field3197 < 0 ? -this.field3197 : this.field3197;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(II)V")
    public final synchronized void method1194(int arg0, int arg1) {
        this.method1205(arg0, arg1, this.method1186());
    }

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "(II)I")
    private static final int method1195(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([B[IIIIIIIILii;)I")
    private static final int method1196(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class180 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field3201 += (var14 - arg3) * arg9.field3210;
        arg9.field3207 += (var14 - arg3) * arg9.field3196;
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
        arg9.field3202 = var12 >> 2;
        arg9.field3206 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(I[B[IIIIIIIILii;)I")
    private static final int method1197(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10) {
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
        arg10.field3206 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([B[IIIIIIIILii;)I")
    private static final int method1198(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class180 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field3201 += (var14 - arg3) * arg9.field3210;
        arg9.field3207 += (var14 - arg3) * arg9.field3196;
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
        arg9.field3202 = var12 >> 2;
        arg9.field3206 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "(II)V")
    private final synchronized void method1199(int arg0, int arg1) {
        this.field3205 = arg0;
        this.field3198 = arg1;
        this.field3200 = 0;
        this.method1180();
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "()I")
    public final int method1200() {
        int var1 = this.field3202 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field3208 == 0) {
            var2 -= this.field3206 * var2 / (((class222) super.field3990).field3974.length << 8);
        } else if (this.field3208 >= 0) {
            var2 -= this.field3199 * var2 / ((class222) super.field3990).field3974.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "()I")
    public final synchronized int method1201() {
        return this.field3205 == Integer.MIN_VALUE ? 0 : this.field3205;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfi;II)Lii;")
    public static final class180 method1202(class222 arg0, int arg1, int arg2) {
        return arg0.field3974 != null && arg0.field3974.length != 0 ? new class180(arg0, (int) ((long) arg0.field3976 * 256L * (long) arg1 / (long) (class125.field2242 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lfi;III)Lii;")
    public static final class180 method1203(class222 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3974 != null && arg0.field3974.length != 0 ? new class180(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "([B[IIIIIIILii;)I")
    private static final int method1204(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class180 arg8) {
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
        arg8.field3206 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "()Lvg;")
    public final class224 method211() {
        return null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(III)V")
    public final synchronized void method1205(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method1199(arg1, arg2);
        } else {
            int var4 = method1172(arg1, arg2);
            int var5 = method1195(arg1, arg2);
            if (this.field3201 == var4 && this.field3207 == var5) {
                this.field3200 = 0;
            } else {
                int var6 = arg1 - this.field3202;
                if (this.field3202 - arg1 > var6) {
                    var6 = this.field3202 - arg1;
                }
                if (var4 - this.field3201 > var6) {
                    var6 = var4 - this.field3201;
                }
                if (this.field3201 - var4 > var6) {
                    var6 = this.field3201 - var4;
                }
                if (var5 - this.field3207 > var6) {
                    var6 = var5 - this.field3207;
                }
                if (this.field3207 - var5 > var6) {
                    var6 = this.field3207 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field3200 = arg0;
                this.field3205 = arg1;
                this.field3198 = arg2;
                this.field3209 = (arg1 - this.field3202) / arg0;
                this.field3210 = (var4 - this.field3201) / arg0;
                this.field3196 = (var5 - this.field3207) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "()Z")
    public final boolean method1206() {
        return this.field3206 < 0 || this.field3206 >= ((class222) super.field3990).field3974.length << 8;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "()I")
    public final int method174() {
        return this.field3205 == 0 && this.field3200 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "(I[B[IIIIIIIILii;)I")
    private static final int method1207(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class180 arg10) {
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
        arg10.field3206 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "(I)V")
    public final synchronized void method1208(int arg0) {
        this.field3208 = arg0;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lfi;II)V")
    private class180(class222 arg0, int arg1, int arg2) {
        super.field3990 = arg0;
        this.field3199 = arg0.field3975;
        this.field3203 = arg0.field3972;
        this.field3204 = arg0.field3973;
        this.field3197 = arg1;
        this.field3205 = arg2;
        this.field3198 = 8192;
        this.field3206 = 0;
        this.method1180();
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "(Lfi;III)V")
    private class180(class222 arg0, int arg1, int arg2, int arg3) {
        super.field3990 = arg0;
        this.field3199 = arg0.field3975;
        this.field3203 = arg0.field3972;
        this.field3204 = arg0.field3973;
        this.field3197 = arg1;
        this.field3205 = arg2;
        this.field3198 = arg3;
        this.field3206 = 0;
        this.method1180();
    }
}
