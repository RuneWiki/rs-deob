import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class76 extends class85 {

    @OriginalMember(owner = "client!nd", name = "z", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    private int field1200;

    @OriginalMember(owner = "client!nd", name = "A", descriptor = "Z")
    private boolean field1190;

    @OriginalMember(owner = "client!nd", name = "F", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client!nd", name = "D", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    private int field1199;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    private int field1198;

    @OriginalMember(owner = "client!nd", name = "w", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!nd", name = "x", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client!nd", name = "y", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client!nd", name = "B", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!nd", name = "C", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!nd", name = "E", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "I")
    private int field1197;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "()Z", line = 4)
    public final boolean method538() {
        return this.field1186 != 0;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "()I", line = 8)
    public final int method539() {
        int var1 = this.field1191 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1196 == 0) {
            var2 -= this.field1198 * var2 / (((class310) this.field1520).field5182.length << 8);
        } else if (this.field1196 >= 0) {
            var2 -= this.field1189 * var2 / ((class310) this.field1520).field5182.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[B[IIIIIIIIIILnd;)I", line = 23)
    private static final int method540(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class76 arg12) {
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
        arg12.field1191 += (var19 - arg4) * arg12.field1197;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13++];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13++];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13++];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13++];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13++];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1188 = var15 >> 2;
        arg12.field1187 = var16 >> 2;
        arg12.field1198 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V", line = 76)
    public final synchronized void method541(int arg0) {
        if (arg0 == 0) {
            this.method545(0);
            this.method1183(false);
        } else if (this.field1188 == 0 && this.field1187 == 0) {
            this.field1186 = 0;
            this.field1193 = 0;
            this.field1191 = 0;
            this.method1183(false);
        } else {
            int var2 = -this.field1191;
            if (this.field1191 > var2) {
                var2 = this.field1191;
            }
            if (-this.field1188 > var2) {
                var2 = -this.field1188;
            }
            if (this.field1188 > var2) {
                var2 = this.field1188;
            }
            if (-this.field1187 > var2) {
                var2 = -this.field1187;
            }
            if (this.field1187 > var2) {
                var2 = this.field1187;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1186 = arg0;
            this.field1193 = Integer.MIN_VALUE;
            this.field1197 = -this.field1191 / arg0;
            this.field1192 = -this.field1188 / arg0;
            this.field1194 = -this.field1187 / arg0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "()Z", line = 122)
    private final boolean method542() {
        int var1 = this.field1193;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method567(var1, this.field1199);
            var2 = method552(var1, this.field1199);
        }
        if (this.field1191 != var1 || this.field1188 != var3 || this.field1187 != var2) {
            if (this.field1191 < var1) {
                this.field1197 = 1;
                this.field1186 = var1 - this.field1191;
            } else if (this.field1191 > var1) {
                this.field1197 = -1;
                this.field1186 = this.field1191 - var1;
            } else {
                this.field1197 = 0;
            }
            if (this.field1188 < var3) {
                this.field1192 = 1;
                if (this.field1186 == 0 || this.field1186 > var3 - this.field1188) {
                    this.field1186 = var3 - this.field1188;
                }
            } else if (this.field1188 > var3) {
                this.field1192 = -1;
                if (this.field1186 == 0 || this.field1186 > this.field1188 - var3) {
                    this.field1186 = this.field1188 - var3;
                }
            } else {
                this.field1192 = 0;
            }
            if (this.field1187 < var2) {
                this.field1194 = 1;
                if (this.field1186 == 0 || this.field1186 > var2 - this.field1187) {
                    this.field1186 = var2 - this.field1187;
                }
            } else if (this.field1187 > var2) {
                this.field1194 = -1;
                if (this.field1186 == 0 || this.field1186 > this.field1187 - var2) {
                    this.field1186 = this.field1187 - var2;
                }
            } else {
                this.field1194 = 0;
            }
            return false;
        } else if (this.field1193 == Integer.MIN_VALUE) {
            this.field1193 = 0;
            this.field1191 = this.field1188 = this.field1187 = 0;
            this.method1183(false);
            return true;
        } else {
            this.method574();
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)V", line = 207)
    public final synchronized void method543(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method550(arg1, arg2);
            return;
        }
        int var4 = method567(arg1, arg2);
        int var5 = method552(arg1, arg2);
        if (this.field1188 == var4 && this.field1187 == var5) {
            this.field1186 = 0;
            return;
        }
        int var6 = arg1 - this.field1191;
        if (this.field1191 - arg1 > var6) {
            var6 = this.field1191 - arg1;
        }
        if (var4 - this.field1188 > var6) {
            var6 = var4 - this.field1188;
        }
        if (this.field1188 - var4 > var6) {
            var6 = this.field1188 - var4;
        }
        if (var5 - this.field1187 > var6) {
            var6 = var5 - this.field1187;
        }
        if (this.field1187 - var5 > var6) {
            var6 = this.field1187 - var5;
        }
        if (arg0 > var6) {
            arg0 = var6;
        }
        this.field1186 = arg0;
        this.field1193 = arg1;
        this.field1199 = arg2;
        this.field1197 = (arg1 - this.field1191) / arg0;
        this.field1192 = (var4 - this.field1188) / arg0;
        this.field1194 = (var5 - this.field1187) / arg0;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)V", line = 255)
    public final synchronized void method544(int arg0) {
        int var2 = ((class310) this.field1520).field5182.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1198 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V", line = 265)
    private final synchronized void method545(int arg0) {
        this.method550(arg0, this.method572());
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[IIIIIIIILnd;II)I", line = 268)
    private static final int method546(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class76 arg11, int arg12, int arg13) {
        arg11.field1188 -= arg11.field1192 * arg5;
        arg11.field1187 -= arg11.field1194 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15 + 1] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4 - 1) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        while (arg5 < var17) {
            byte var19 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var19 << 8) + (arg4 & 0xFF) * (var18 - var19)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        arg11.field1188 += arg11.field1192 * arg5;
        arg11.field1187 += arg11.field1194 * arg5;
        arg11.field1191 = arg6;
        arg11.field1198 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[IIIIIIILnd;II)I", line = 301)
    private static final int method547(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class76 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 - arg4 - 257) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14 + 1] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4 - 1) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        while (arg5 < var16) {
            byte var18 = arg2[arg4 >> 8];
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (var17 - var18)) * arg6 >> 6;
            arg4 += arg11;
        }
        arg10.field1198 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "()Lcb;", line = 327)
    public final class85 method453() {
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([B[IIIIIIILnd;)I", line = 332)
    private static final int method548(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class76 arg8) {
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
        arg8.field1198 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II)V", line = 357)
    public final synchronized void method549(int arg0, int arg1) {
        this.method543(arg0, arg1, this.method572());
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 360)
    public final synchronized void method455(int arg0) {
        if (this.field1186 > 0) {
            if (arg0 >= this.field1186) {
                if (this.field1193 == Integer.MIN_VALUE) {
                    this.field1193 = 0;
                    this.field1191 = this.field1188 = this.field1187 = 0;
                    this.method1183(false);
                    arg0 = this.field1186;
                }
                this.field1186 = 0;
                this.method574();
            } else {
                this.field1191 += this.field1197 * arg0;
                this.field1188 += this.field1192 * arg0;
                this.field1187 += this.field1194 * arg0;
                this.field1186 -= arg0;
            }
        }
        class310 var2 = (class310) this.field1520;
        int var3 = this.field1189 << 8;
        int var4 = this.field1200 << 8;
        int var5 = var2.field5182.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1196 = 0;
        }
        if (this.field1198 < 0) {
            if (this.field1195 <= 0) {
                this.method570();
                this.method1183(false);
                return;
            }
            this.field1198 = 0;
        }
        if (this.field1198 >= var5) {
            if (this.field1195 >= 0) {
                this.method570();
                this.method1183(false);
                return;
            }
            this.field1198 = var5 - 1;
        }
        this.field1198 += this.field1195 * arg0;
        if (this.field1196 >= 0) {
            if (this.field1196 > 0) {
                if (this.field1190) {
                    label121: {
                        if (this.field1195 < 0) {
                            if (this.field1198 >= var3) {
                                return;
                            }
                            this.field1198 = var3 + var3 - this.field1198 - 1;
                            this.field1195 = -this.field1195;
                            if (--this.field1196 == 0) {
                                break label121;
                            }
                        }
                        do {
                            if (this.field1198 < var4) {
                                return;
                            }
                            this.field1198 = var4 + var4 - this.field1198 - 1;
                            this.field1195 = -this.field1195;
                            if (--this.field1196 == 0) {
                                break;
                            }
                            if (this.field1198 >= var3) {
                                return;
                            }
                            this.field1198 = var3 + var3 - this.field1198 - 1;
                            this.field1195 = -this.field1195;
                        } while (--this.field1196 != 0);
                    }
                } else {
                    label153: {
                        if (this.field1195 < 0) {
                            if (this.field1198 >= var3) {
                                return;
                            }
                            int var7 = (var4 - this.field1198 - 1) / var6;
                            if (var7 >= this.field1196) {
                                this.field1198 += this.field1196 * var6;
                                this.field1196 = 0;
                                break label153;
                            }
                            this.field1198 += var6 * var7;
                            this.field1196 -= var7;
                        } else if (this.field1198 >= var4) {
                            int var8 = (this.field1198 - var3) / var6;
                            if (var8 >= this.field1196) {
                                this.field1198 -= this.field1196 * var6;
                                this.field1196 = 0;
                                break label153;
                            }
                            this.field1198 -= var6 * var8;
                            this.field1196 -= var8;
                        } else {
                            return;
                        }
                        return;
                    }
                }
            }
            if (this.field1195 < 0) {
                if (this.field1198 < 0) {
                    this.field1198 = -1;
                    this.method570();
                    this.method1183(false);
                }
            } else if (this.field1198 >= var5) {
                this.field1198 = var5;
                this.method570();
                this.method1183(false);
            }
        } else if (this.field1190) {
            if (this.field1195 < 0) {
                if (this.field1198 >= var3) {
                    return;
                }
                this.field1198 = var3 + var3 - this.field1198 - 1;
                this.field1195 = -this.field1195;
            }
            while (this.field1198 >= var4) {
                this.field1198 = var4 + var4 - this.field1198 - 1;
                this.field1195 = -this.field1195;
                if (this.field1198 >= var3) {
                    return;
                }
                this.field1198 = var3 + var3 - this.field1198 - 1;
                this.field1195 = -this.field1195;
            }
        } else if (this.field1195 < 0) {
            if (this.field1198 >= var3) {
                return;
            }
            this.field1198 = var4 - (var4 - 1 - this.field1198) % var6 - 1;
        } else if (this.field1198 >= var4) {
            this.field1198 = (this.field1198 - var3) % var6 + var3;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II)V", line = 578)
    private final synchronized void method550(int arg0, int arg1) {
        this.field1193 = arg0;
        this.field1199 = arg1;
        this.field1186 = 0;
        this.method574();
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "()I", line = 588)
    public final synchronized int method551() {
        return this.field1195 < 0 ? -this.field1195 : this.field1195;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II)I", line = 591)
    private static final int method552(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II[B[IIIIIIILnd;II)I", line = 597)
    private static final int method553(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class76 arg10, int arg11, int arg12) {
        int var13;
        if (arg11 == 0 || (var13 = (arg9 + arg11 + 256 - arg4) / arg11 + arg5) > arg8) {
            var13 = arg8;
        }
        int var10001;
        while (arg5 < var13) {
            int var14 = arg4 >> 8;
            byte var15 = arg2[var14 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var15 << 8) + (arg4 & 0xFF) * (arg2[var14] - var15)) * arg6 >> 6;
            arg4 += arg11;
        }
        int var16;
        if (arg11 == 0 || (var16 = (arg9 + arg11 - arg4) / arg11 + arg5) > arg8) {
            var16 = arg8;
        }
        int var17 = arg12;
        int var18 = arg11;
        while (arg5 < var16) {
            var10001 = arg5++;
            arg3[var10001] += ((var17 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var17)) * arg6 >> 6;
            arg4 += var18;
        }
        arg10.field1198 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([IIIII)I", line = 623)
    private final int method554(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1186 > 0) {
                int var6 = this.field1186 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1186 += arg1;
                if (this.field1195 == -256 && (this.field1198 & 0xFF) == 0) {
                    if (class15.field233) {
                        arg1 = method568(0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, this.field1192, this.field1194, 0, var6, arg2, this);
                    } else {
                        arg1 = method559(((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, this.field1197, 0, var6, arg2, this);
                    }
                } else if (class15.field233) {
                    arg1 = method565(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, this.field1192, this.field1194, 0, var6, arg2, this, this.field1195, arg4);
                } else {
                    arg1 = method555(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, this.field1197, 0, var6, arg2, this, this.field1195, arg4);
                }
                this.field1186 -= arg1;
                if (this.field1186 != 0) {
                    return arg1;
                }
                if (!this.method542()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1195 == -256 && (this.field1198 & 0xFF) == 0) {
                if (class15.field233) {
                    return method575(0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, 0, arg3, arg2, this);
                }
                return method571(((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, 0, arg3, arg2, this);
            }
            if (class15.field233) {
                return method556(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, 0, arg3, arg2, this, this.field1195, arg4);
            }
            return method553(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, 0, arg3, arg2, this, this.field1195, arg4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II[B[IIIIIIIILnd;II)I", line = 678)
    private static final int method555(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class76 arg11, int arg12, int arg13) {
        arg11.field1188 -= arg11.field1192 * arg5;
        arg11.field1187 -= arg11.field1194 * arg5;
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var10001;
        while (arg5 < var14) {
            int var15 = arg4 >> 8;
            byte var16 = arg2[var15 - 1];
            var10001 = arg5++;
            arg3[var10001] += ((var16 << 8) + (arg4 & 0xFF) * (arg2[var15] - var16)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += arg12;
        }
        int var17;
        if (arg12 == 0 || (var17 = (arg10 + arg12 - arg4) / arg12 + arg5) > arg9) {
            var17 = arg9;
        }
        int var18 = arg13;
        int var19 = arg12;
        while (arg5 < var17) {
            var10001 = arg5++;
            arg3[var10001] += ((var18 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var18)) * arg6 >> 6;
            arg6 += arg7;
            arg4 += var19;
        }
        arg11.field1188 += arg11.field1192 * arg5;
        arg11.field1187 += arg11.field1194 * arg5;
        arg11.field1191 = arg6;
        arg11.field1198 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(II[B[IIIIIIIILnd;II)I", line = 712)
    private static final int method556(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class76 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 + 256 - arg4) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17 - 1];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var24 = var15++;
            arg3[var24] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            int var23 = (var22 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var22);
            var10001 = var15++;
            arg3[var10001] += arg6 * var23 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var23 >> 6;
            arg4 += arg12;
        }
        arg11.field1198 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "(Z)V", line = 744)
    public final synchronized void method557(boolean arg0) {
        this.field1195 = (this.field1195 >>> 31) + (this.field1195 ^ this.field1195 >> 31);
        if (arg0) {
            this.field1195 = -this.field1195;
        }
    }

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "()I", line = 750)
    public final synchronized int method558() {
        return this.field1193 == Integer.MIN_VALUE ? 0 : this.field1193;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([B[IIIIIIIILnd;)I", line = 753)
    private static final int method559(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class76 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1188 += (var14 - arg3) * arg9.field1192;
        arg9.field1187 += (var14 - arg3) * arg9.field1194;
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
        arg9.field1191 = var12 >> 2;
        arg9.field1198 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "()Z", line = 787)
    public final boolean method560() {
        return this.field1198 < 0 || this.field1198 >= ((class310) this.field1520).field5182.length << 8;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(II[B[IIIIIIIIIILnd;II)I", line = 791)
    private static final int method561(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class76 arg13, int arg14, int arg15) {
        arg13.field1191 -= arg13.field1197 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 - arg4 - 257) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19 + 1] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var28 = var17++;
            arg3[var28] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4 - 1) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            byte var25 = arg2[arg4 >> 8];
            int var26 = (var25 << 8) + (arg4 & 0xFF) * (var24 - var25);
            var10001 = var17++;
            arg3[var10001] += arg6 * var26 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var26 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var27 = var17 >> 1;
        arg13.field1191 += arg13.field1197 * var27;
        arg13.field1188 = arg6;
        arg13.field1187 = arg7;
        arg13.field1198 = arg4;
        return var27;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ls;II)Lnd;", line = 833)
    public static final class76 method562(class310 arg0, int arg1, int arg2) {
        return arg0.field5182 == null || arg0.field5182.length == 0 ? null : new class76(arg0, (int) ((long) arg0.field5179 * 256L * (long) arg1 / (long) (class306.field5146 * 100)), arg2 << 6);
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II[B[IIIIIIIILnd;II)I", line = 839)
    private static final int method563(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class76 arg11, int arg12, int arg13) {
        int var14;
        if (arg12 == 0 || (var14 = (arg10 + arg12 - arg4 - 257) / arg12 + arg5) > arg9) {
            var14 = arg9;
        }
        int var15 = arg5 << 1;
        int var16 = var14 << 1;
        int var10001;
        while (var15 < var16) {
            int var17 = arg4 >> 8;
            byte var18 = arg2[var17];
            int var19 = (var18 << 8) + (arg4 & 0xFF) * (arg2[var17 + 1] - var18);
            var10001 = var15++;
            arg3[var10001] += arg6 * var19 >> 6;
            int var25 = var15++;
            arg3[var25] += arg7 * var19 >> 6;
            arg4 += arg12;
        }
        int var20;
        if (arg12 == 0 || (var20 = (var15 >> 1) + (arg10 + arg12 - arg4 - 1) / arg12) > arg9) {
            var20 = arg9;
        }
        int var21 = var20 << 1;
        int var22 = arg13;
        while (var15 < var21) {
            byte var23 = arg2[arg4 >> 8];
            int var24 = (var23 << 8) + (arg4 & 0xFF) * (var22 - var23);
            var10001 = var15++;
            arg3[var10001] += arg6 * var24 >> 6;
            var10001 = var15++;
            arg3[var10001] += arg7 * var24 >> 6;
            arg4 += arg12;
        }
        arg11.field1198 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I[B[IIIIIIIILnd;)I", line = 872)
    private static final int method564(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class76 arg10) {
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
            byte var18 = arg1[var11++];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11++];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11++];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11++];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11++];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1198 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(II[B[IIIIIIIIIILnd;II)I", line = 910)
    private static final int method565(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class76 arg13, int arg14, int arg15) {
        arg13.field1191 -= arg13.field1197 * arg5;
        int var16;
        if (arg14 == 0 || (var16 = (arg12 + arg14 + 256 - arg4) / arg14 + arg5) > arg11) {
            var16 = arg11;
        }
        int var17 = arg5 << 1;
        int var18 = var16 << 1;
        int var10001;
        while (var17 < var18) {
            int var19 = arg4 >> 8;
            byte var20 = arg2[var19 - 1];
            int var21 = (var20 << 8) + (arg4 & 0xFF) * (arg2[var19] - var20);
            var10001 = var17++;
            arg3[var10001] += arg6 * var21 >> 6;
            arg6 += arg8;
            int var27 = var17++;
            arg3[var27] += arg7 * var21 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var22;
        if (arg14 == 0 || (var22 = (var17 >> 1) + (arg12 + arg14 - arg4) / arg14) > arg11) {
            var22 = arg11;
        }
        int var23 = var22 << 1;
        int var24 = arg15;
        while (var17 < var23) {
            int var25 = (var24 << 8) + (arg4 & 0xFF) * (arg2[arg4 >> 8] - var24);
            var10001 = var17++;
            arg3[var10001] += arg6 * var25 >> 6;
            arg6 += arg8;
            var10001 = var17++;
            arg3[var10001] += arg7 * var25 >> 6;
            arg7 += arg9;
            arg4 += arg14;
        }
        int var26 = var17 >> 1;
        arg13.field1191 += arg13.field1197 * var26;
        arg13.field1188 = arg6;
        arg13.field1187 = arg7;
        arg13.field1198 = arg4;
        return var26;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([III)V", line = 951)
    public final synchronized void method445(int[] arg0, int arg1, int arg2) {
        if (this.field1193 == 0 && this.field1186 == 0) {
            this.method455(arg2);
            return;
        }
        class310 var4 = (class310) this.field1520;
        int var5 = this.field1189 << 8;
        int var6 = this.field1200 << 8;
        int var7 = var4.field5182.length << 8;
        int var8 = var6 - var5;
        if (var8 <= 0) {
            this.field1196 = 0;
        }
        int var9 = arg1;
        int var10 = arg1 + arg2;
        if (this.field1198 < 0) {
            if (this.field1195 <= 0) {
                this.method570();
                this.method1183(false);
                return;
            }
            this.field1198 = 0;
        }
        if (this.field1198 >= var7) {
            if (this.field1195 >= 0) {
                this.method570();
                this.method1183(false);
                return;
            }
            this.field1198 = var7 - 1;
        }
        if (this.field1196 >= 0) {
            if (this.field1196 > 0) {
                if (this.field1190) {
                    label131: {
                        if (this.field1195 < 0) {
                            var9 = this.method554(arg0, arg1, var5, var10, var4.field5182[this.field1189]);
                            if (this.field1198 >= var5) {
                                return;
                            }
                            this.field1198 = var5 + var5 - this.field1198 - 1;
                            this.field1195 = -this.field1195;
                            if (--this.field1196 == 0) {
                                break label131;
                            }
                        }
                        do {
                            var9 = this.method573(arg0, var9, var6, var10, var4.field5182[this.field1200 - 1]);
                            if (this.field1198 < var6) {
                                return;
                            }
                            this.field1198 = var6 + var6 - this.field1198 - 1;
                            this.field1195 = -this.field1195;
                            if (--this.field1196 == 0) {
                                break;
                            }
                            var9 = this.method554(arg0, var9, var5, var10, var4.field5182[this.field1189]);
                            if (this.field1198 >= var5) {
                                return;
                            }
                            this.field1198 = var5 + var5 - this.field1198 - 1;
                            this.field1195 = -this.field1195;
                        } while (--this.field1196 != 0);
                    }
                } else if (this.field1195 < 0) {
                    while (true) {
                        var9 = this.method554(arg0, var9, var5, var10, var4.field5182[this.field1200 - 1]);
                        if (this.field1198 >= var5) {
                            return;
                        }
                        int var12 = (var6 - this.field1198 - 1) / var8;
                        if (var12 >= this.field1196) {
                            this.field1198 += this.field1196 * var8;
                            this.field1196 = 0;
                            break;
                        }
                        this.field1198 += var8 * var12;
                        this.field1196 -= var12;
                    }
                } else {
                    while (true) {
                        var9 = this.method573(arg0, var9, var6, var10, var4.field5182[this.field1189]);
                        if (this.field1198 < var6) {
                            return;
                        }
                        int var13 = (this.field1198 - var5) / var8;
                        if (var13 >= this.field1196) {
                            this.field1198 -= this.field1196 * var8;
                            this.field1196 = 0;
                            break;
                        }
                        this.field1198 -= var8 * var13;
                        this.field1196 -= var13;
                    }
                }
            }
            if (this.field1195 < 0) {
                this.method554(arg0, var9, 0, var10, 0);
                if (this.field1198 < 0) {
                    this.field1198 = -1;
                    this.method570();
                    this.method1183(false);
                }
            } else {
                this.method573(arg0, var9, var7, var10, 0);
                if (this.field1198 >= var7) {
                    this.field1198 = var7;
                    this.method570();
                    this.method1183(false);
                }
            }
        } else if (this.field1190) {
            if (this.field1195 < 0) {
                var9 = this.method554(arg0, arg1, var5, var10, var4.field5182[this.field1189]);
                if (this.field1198 >= var5) {
                    return;
                }
                this.field1198 = var5 + var5 - this.field1198 - 1;
                this.field1195 = -this.field1195;
            }
            while (true) {
                int var11 = this.method573(arg0, var9, var6, var10, var4.field5182[this.field1200 - 1]);
                if (this.field1198 < var6) {
                    return;
                }
                this.field1198 = var6 + var6 - this.field1198 - 1;
                this.field1195 = -this.field1195;
                var9 = this.method554(arg0, var11, var5, var10, var4.field5182[this.field1189]);
                if (this.field1198 >= var5) {
                    return;
                }
                this.field1198 = var5 + var5 - this.field1198 - 1;
                this.field1195 = -this.field1195;
            }
        } else if (this.field1195 < 0) {
            while (true) {
                var9 = this.method554(arg0, var9, var5, var10, var4.field5182[this.field1200 - 1]);
                if (this.field1198 >= var5) {
                    return;
                }
                this.field1198 = var6 - (var6 - 1 - this.field1198) % var8 - 1;
            }
        } else {
            while (true) {
                var9 = this.method573(arg0, var9, var6, var10, var4.field5182[this.field1189]);
                if (this.field1198 < var6) {
                    return;
                }
                this.field1198 = (this.field1198 - var5) % var8 + var5;
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "(I)V", line = 1188)
    public final synchronized void method566(int arg0) {
        this.field1196 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "(II)I", line = 1192)
    private static final int method567(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I[B[IIIIIIIIIILnd;)I", line = 1196)
    private static final int method568(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class76 arg12) {
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
        arg12.field1191 += (var19 - arg4) * arg12.field1197;
        int var20 = arg4 << 1;
        int var21 = var19 << 1;
        int var44 = var21 - 6;
        while (var20 < var44) {
            byte var22 = arg1[var13--];
            int var33 = var20++;
            arg2[var33] += var15 * var22;
            int var23 = var15 + var17;
            int var34 = var20++;
            arg2[var34] += var16 * var22;
            int var24 = var16 + var18;
            byte var25 = arg1[var13--];
            int var36 = var20++;
            arg2[var36] += var23 * var25;
            int var26 = var17 + var23;
            int var37 = var20++;
            arg2[var37] += var24 * var25;
            int var27 = var18 + var24;
            byte var28 = arg1[var13--];
            int var39 = var20++;
            arg2[var39] += var26 * var28;
            int var29 = var17 + var26;
            int var40 = var20++;
            arg2[var40] += var27 * var28;
            int var30 = var18 + var27;
            byte var31 = arg1[var13--];
            int var42 = var20++;
            arg2[var42] += var29 * var31;
            var15 = var17 + var29;
            int var43 = var20++;
            arg2[var43] += var30 * var31;
            var16 = var18 + var30;
        }
        var21 = var44 + 6;
        while (var20 < var21) {
            byte var32 = arg1[var13--];
            int var10001 = var20++;
            arg2[var10001] += var15 * var32;
            var15 += var17;
            int var45 = var20++;
            arg2[var45] += var16 * var32;
            var16 += var18;
        }
        arg12.field1188 = var15 >> 2;
        arg12.field1187 = var16 >> 2;
        arg12.field1198 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)V", line = 1250)
    public final synchronized void method569(int arg0) {
        this.method550(arg0 << 6, this.method572());
    }

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "()V", line = 1253)
    private final void method570() {
        if (this.field1186 == 0) {
            return;
        }
        if (this.field1193 == Integer.MIN_VALUE) {
            this.field1193 = 0;
        }
        this.field1186 = 0;
        this.method574();
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([B[IIIIIIILnd;)I", line = 1264)
    private static final int method571(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class76 arg8) {
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
        arg8.field1198 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "()I", line = 1289)
    public final synchronized int method572() {
        return this.field1199 < 0 ? -1 : this.field1199;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([IIIII)I", line = 1292)
    private final int method573(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        while (true) {
            if (this.field1186 > 0) {
                int var6 = this.field1186 + arg1;
                if (var6 > arg3) {
                    var6 = arg3;
                }
                this.field1186 += arg1;
                if (this.field1195 == 256 && (this.field1198 & 0xFF) == 0) {
                    if (class15.field233) {
                        arg1 = method540(0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, this.field1192, this.field1194, 0, var6, arg2, this);
                    } else {
                        arg1 = method578(((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, this.field1197, 0, var6, arg2, this);
                    }
                } else if (class15.field233) {
                    arg1 = method561(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, this.field1192, this.field1194, 0, var6, arg2, this, this.field1195, arg4);
                } else {
                    arg1 = method546(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, this.field1197, 0, var6, arg2, this, this.field1195, arg4);
                }
                this.field1186 -= arg1;
                if (this.field1186 != 0) {
                    return arg1;
                }
                if (!this.method542()) {
                    continue;
                }
                return arg3;
            }
            if (this.field1195 == 256 && (this.field1198 & 0xFF) == 0) {
                if (class15.field233) {
                    return method564(0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, 0, arg3, arg2, this);
                }
                return method548(((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, 0, arg3, arg2, this);
            }
            if (class15.field233) {
                return method563(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1188, this.field1187, 0, arg3, arg2, this, this.field1195, arg4);
            }
            return method547(0, 0, ((class310) this.field1520).field5182, arg0, this.field1198, arg1, this.field1191, 0, arg3, arg2, this, this.field1195, arg4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "()I", line = 1347)
    public final int method447() {
        return this.field1193 == 0 && this.field1186 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "()V", line = 1357)
    private final void method574() {
        this.field1191 = this.field1193;
        this.field1188 = method567(this.field1193, this.field1199);
        this.field1187 = method552(this.field1193, this.field1199);
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I[B[IIIIIIIILnd;)I", line = 1362)
    private static final int method575(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class76 arg10) {
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
            byte var18 = arg1[var11--];
            int var24 = var16++;
            arg2[var24] += var13 * var18;
            int var25 = var16++;
            arg2[var25] += var14 * var18;
            byte var19 = arg1[var11--];
            int var27 = var16++;
            arg2[var27] += var13 * var19;
            int var28 = var16++;
            arg2[var28] += var14 * var19;
            byte var20 = arg1[var11--];
            int var30 = var16++;
            arg2[var30] += var13 * var20;
            int var31 = var16++;
            arg2[var31] += var14 * var20;
            byte var21 = arg1[var11--];
            int var33 = var16++;
            arg2[var33] += var13 * var21;
            int var34 = var16++;
            arg2[var34] += var14 * var21;
        }
        var17 = var23 + 6;
        while (var16 < var17) {
            byte var22 = arg1[var11--];
            int var10001 = var16++;
            arg2[var10001] += var13 * var22;
            int var35 = var16++;
            arg2[var35] += var14 * var22;
        }
        arg10.field1198 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "()Lcb;", line = 1402)
    public final class85 method452() {
        return null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ls;III)Lnd;", line = 1406)
    public static final class76 method576(class310 arg0, int arg1, int arg2, int arg3) {
        return arg0.field5182 == null || arg0.field5182.length == 0 ? null : new class76(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "(I)V", line = 1412)
    public final synchronized void method577(int arg0) {
        if (this.field1195 < 0) {
            this.field1195 = -arg0;
        } else {
            this.field1195 = arg0;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "([B[IIIIIIIILnd;)I", line = 1419)
    private static final int method578(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class76 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1188 += (var14 - arg3) * arg9.field1192;
        arg9.field1187 += (var14 - arg3) * arg9.field1194;
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
        arg9.field1191 = var12 >> 2;
        arg9.field1198 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ls;II)V", line = 1457)
    private class76(class310 arg0, int arg1, int arg2) {
        this.field1520 = arg0;
        this.field1189 = arg0.field5181;
        this.field1200 = arg0.field5180;
        this.field1190 = arg0.field5183;
        this.field1195 = arg1;
        this.field1193 = arg2;
        this.field1199 = 8192;
        this.field1198 = 0;
        this.method574();
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "(Ls;III)V", line = 1469)
    private class76(class310 arg0, int arg1, int arg2, int arg3) {
        this.field1520 = arg0;
        this.field1189 = arg0.field5181;
        this.field1200 = arg0.field5180;
        this.field1190 = arg0.field5183;
        this.field1195 = arg1;
        this.field1193 = arg2;
        this.field1199 = arg3;
        this.field1198 = 0;
        this.method574();
    }
}
