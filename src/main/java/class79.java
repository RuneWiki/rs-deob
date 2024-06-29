import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class79 extends class409 {

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    private int field1194;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "Z")
    private boolean field1190;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    private int field1184;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    private int field1196;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    private int field1189;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "I")
    private int field1192;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    private int field1182;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    private int field1183;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    private int field1185;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "I")
    private int field1186;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "I")
    private int field1187;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    private int field1188;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "I")
    private int field1193;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "I")
    private int field1195;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[B[IIIIIIILtk;II)I")
    private static final int method675(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10, int arg11, int arg12) {
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
        arg10.field1192 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II[B[IIIIIIILtk;II)I")
    private static final int method676(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10, int arg11, int arg12) {
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
        arg10.field1192 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "()Z")
    public final boolean method677() {
        return this.field1192 < 0 || this.field1192 >= ((class294) super.field5726).field3966.length << 8;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[B[IIIIIIIILtk;II)I")
    private static final int method678(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
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
        arg11.field1192 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II[B[IIIIIIIILtk;II)I")
    private static final int method679(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
        arg11.field1183 -= arg11.field1182 * arg5;
        arg11.field1186 -= arg11.field1193 * arg5;
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
        arg11.field1183 += arg11.field1182 * arg5;
        arg11.field1186 += arg11.field1193 * arg5;
        arg11.field1195 = arg6;
        arg11.field1192 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(I)V")
    public final synchronized void method680(int arg0) {
        if (this.field1184 < 0) {
            this.field1184 = -arg0;
        } else {
            this.field1184 = arg0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II[B[IIIIIIIILtk;II)I")
    private static final int method681(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
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
        arg11.field1192 = arg4;
        return var15 >> 1;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "()I")
    public final synchronized int method682() {
        return this.field1189 < 0 ? -1 : this.field1189;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)V")
    public final synchronized void method683(int arg0) {
        if (this.field1187 > 0) {
            if (arg0 >= this.field1187) {
                if (this.field1196 == Integer.MIN_VALUE) {
                    this.field1196 = 0;
                    this.field1195 = this.field1183 = this.field1186 = 0;
                    this.method2367(5);
                    arg0 = this.field1187;
                }
                this.field1187 = 0;
                this.method694();
            } else {
                this.field1195 += this.field1185 * arg0;
                this.field1183 += this.field1182 * arg0;
                this.field1186 += this.field1193 * arg0;
                this.field1187 -= arg0;
            }
        }
        class294 var2 = (class294) super.field5726;
        int var3 = this.field1191 << 8;
        int var4 = this.field1194 << 8;
        int var5 = var2.field3966.length << 8;
        int var6 = var4 - var3;
        if (var6 <= 0) {
            this.field1188 = 0;
        }
        if (this.field1192 < 0) {
            if (this.field1184 <= 0) {
                this.method703();
                this.method2367(5);
                return;
            }
            this.field1192 = 0;
        }
        if (this.field1192 >= var5) {
            if (this.field1184 >= 0) {
                this.method703();
                this.method2367(5);
                return;
            }
            this.field1192 = var5 - 1;
        }
        this.field1192 += this.field1184 * arg0;
        if (this.field1188 < 0) {
            if (!this.field1190) {
                if (this.field1184 < 0) {
                    if (this.field1192 < var3) {
                        this.field1192 = var4 - 1 - (var4 - 1 - this.field1192) % var6;
                    }
                } else if (this.field1192 >= var4) {
                    this.field1192 = (this.field1192 - var3) % var6 + var3;
                }
            } else {
                if (this.field1184 < 0) {
                    if (this.field1192 >= var3) {
                        return;
                    }
                    this.field1192 = var3 + var3 - 1 - this.field1192;
                    this.field1184 = -this.field1184;
                }
                while (this.field1192 >= var4) {
                    this.field1192 = var4 + var4 - 1 - this.field1192;
                    this.field1184 = -this.field1184;
                    if (this.field1192 >= var3) {
                        return;
                    }
                    this.field1192 = var3 + var3 - 1 - this.field1192;
                    this.field1184 = -this.field1184;
                }
            }
        } else {
            if (this.field1188 > 0) {
                if (this.field1190) {
                    label125: {
                        if (this.field1184 < 0) {
                            if (this.field1192 >= var3) {
                                return;
                            }
                            this.field1192 = var3 + var3 - 1 - this.field1192;
                            this.field1184 = -this.field1184;
                            if (--this.field1188 == 0) {
                                break label125;
                            }
                        }
                        do {
                            if (this.field1192 < var4) {
                                return;
                            }
                            this.field1192 = var4 + var4 - 1 - this.field1192;
                            this.field1184 = -this.field1184;
                            if (--this.field1188 == 0) {
                                break;
                            }
                            if (this.field1192 >= var3) {
                                return;
                            }
                            this.field1192 = var3 + var3 - 1 - this.field1192;
                            this.field1184 = -this.field1184;
                        } while (--this.field1188 != 0);
                    }
                } else if (this.field1184 < 0) {
                    if (this.field1192 >= var3) {
                        return;
                    }
                    int var7 = (var4 - 1 - this.field1192) / var6;
                    if (var7 < this.field1188) {
                        this.field1192 += var6 * var7;
                        this.field1188 -= var7;
                        return;
                    }
                    this.field1192 += this.field1188 * var6;
                    this.field1188 = 0;
                } else {
                    if (this.field1192 < var4) {
                        return;
                    }
                    int var8 = (this.field1192 - var3) / var6;
                    if (var8 < this.field1188) {
                        this.field1192 -= var6 * var8;
                        this.field1188 -= var8;
                        return;
                    }
                    this.field1192 -= this.field1188 * var6;
                    this.field1188 = 0;
                }
            }
            if (this.field1184 < 0) {
                if (this.field1192 < 0) {
                    this.field1192 = -1;
                    this.method703();
                    this.method2367(5);
                    return;
                }
            } else if (this.field1192 >= var5) {
                this.field1192 = var5;
                this.method703();
                this.method2367(5);
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "(I)V")
    public final synchronized void method684(int arg0) {
        int var2 = ((class294) super.field5726).field3966.length << 8;
        if (arg0 < -1) {
            arg0 = -1;
        }
        if (arg0 > var2) {
            arg0 = var2;
        }
        this.field1192 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(II[B[IIIIIIIILtk;II)I")
    private static final int method685(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class79 arg11, int arg12, int arg13) {
        arg11.field1183 -= arg11.field1182 * arg5;
        arg11.field1186 -= arg11.field1193 * arg5;
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
        arg11.field1183 += arg11.field1182 * arg5;
        arg11.field1186 += arg11.field1193 * arg5;
        arg11.field1195 = arg6;
        arg11.field1192 = arg4;
        return arg5;
    }

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "(I)V")
    public final synchronized void method686(int arg0) {
        this.field1188 = arg0;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "()I")
    public final int method687() {
        return this.field1196 == 0 && this.field1187 == 0 ? 0 : 1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[B[IIIIIIIILtk;)I")
    private static final int method688(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10) {
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
        arg10.field1192 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II[B[IIIIIIIIIILtk;II)I")
    private static final int method689(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class79 arg13, int arg14, int arg15) {
        arg13.field1195 -= arg13.field1185 * arg5;
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
        arg13.field1195 += arg13.field1185 * var22;
        arg13.field1183 = arg6;
        arg13.field1186 = arg7;
        arg13.field1192 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "()Lmi;")
    public final class409 method690() {
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "(I)V")
    public final synchronized void method691(int arg0) {
        this.method700(arg0 << 6, this.method682());
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I[B[IIIIIIIILtk;)I")
    private static final int method692(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class79 arg10) {
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
        arg10.field1192 = var11 << 8;
        return var16 >> 1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([IIIII)I")
    private final int method693(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1187 <= 0) {
                if (this.field1184 == 256 && (this.field1192 & 255) == 0) {
                    if (class373.field5246) {
                        return method688(0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, 0, arg3, arg2, this);
                    }
                    return method709(((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, 0, arg3, arg2, this);
                }
                if (class373.field5246) {
                    return method681(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, 0, arg3, arg2, this, this.field1184, arg4);
                }
                return method676(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, 0, arg3, arg2, this, this.field1184, arg4);
            }
            int var6 = this.field1187 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1187 += arg1;
            if (this.field1184 == 256 && (this.field1192 & 255) == 0) {
                if (class373.field5246) {
                    arg1 = method698(0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, this.field1182, this.field1193, 0, var6, arg2, this);
                } else {
                    arg1 = method719(((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, this.field1185, 0, var6, arg2, this);
                }
            } else if (class373.field5246) {
                arg1 = method718(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, this.field1182, this.field1193, 0, var6, arg2, this, this.field1184, arg4);
            } else {
                arg1 = method679(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, this.field1185, 0, var6, arg2, this, this.field1184, arg4);
            }
            this.field1187 -= arg1;
            if (this.field1187 != 0) {
                return arg1;
            }
        } while (!this.method714());
        return arg3;
    }

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "()V")
    private final void method694() {
        this.field1195 = this.field1196;
        this.field1183 = method702(this.field1196, this.field1189);
        this.field1186 = method697(this.field1196, this.field1189);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V")
    public final synchronized void method695(boolean arg0) {
        this.field1184 = (this.field1184 >>> 31) + (this.field1184 ^ this.field1184 >> 31);
        if (arg0) {
            this.field1184 = -this.field1184;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lkf;II)Ltk;")
    public static final class79 method696(class294 arg0, int arg1, int arg2) {
        return arg0.field3966 != null && arg0.field3966.length != 0 ? new class79(arg0, (int) ((long) arg0.field3967 * 256L * (long) arg1 / (long) (class413.field5774 * 100)), arg2 << 6) : null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
    private static final int method697(int arg0, int arg1) {
        return arg1 < 0 ? -arg0 : (int) ((double) arg0 * Math.sqrt((double) arg1 * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I[B[IIIIIIIIIILtk;)I")
    private static final int method698(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class79 arg12) {
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
        arg12.field1195 += (var19 - arg4) * arg12.field1185;
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
        arg12.field1183 = var15 >> 2;
        arg12.field1186 = var16 >> 2;
        arg12.field1192 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "([IIIII)I")
    private final int method699(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        do {
            if (this.field1187 <= 0) {
                if (this.field1184 == -256 && (this.field1192 & 255) == 0) {
                    if (class373.field5246) {
                        return method692(0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, 0, arg3, arg2, this);
                    }
                    return method707(((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, 0, arg3, arg2, this);
                }
                if (class373.field5246) {
                    return method678(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, 0, arg3, arg2, this, this.field1184, arg4);
                }
                return method675(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, 0, arg3, arg2, this, this.field1184, arg4);
            }
            int var6 = this.field1187 + arg1;
            if (var6 > arg3) {
                var6 = arg3;
            }
            this.field1187 += arg1;
            if (this.field1184 == -256 && (this.field1192 & 255) == 0) {
                if (class373.field5246) {
                    arg1 = method711(0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, this.field1182, this.field1193, 0, var6, arg2, this);
                } else {
                    arg1 = method712(((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, this.field1185, 0, var6, arg2, this);
                }
            } else if (class373.field5246) {
                arg1 = method689(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1183, this.field1186, this.field1182, this.field1193, 0, var6, arg2, this, this.field1184, arg4);
            } else {
                arg1 = method685(0, 0, ((class294) super.field5726).field3966, arg0, this.field1192, arg1, this.field1195, this.field1185, 0, var6, arg2, this, this.field1184, arg4);
            }
            this.field1187 -= arg1;
            if (this.field1187 != 0) {
                return arg1;
            }
        } while (!this.method714());
        return arg3;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V")
    private final synchronized void method700(int arg0, int arg1) {
        this.field1196 = arg0;
        this.field1189 = arg1;
        this.field1187 = 0;
        this.method694();
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lkf;III)Ltk;")
    public static final class79 method701(class294 arg0, int arg1, int arg2, int arg3) {
        return arg0.field3966 != null && arg0.field3966.length != 0 ? new class79(arg0, arg1, arg2, arg3) : null;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(II)I")
    private static final int method702(int arg0, int arg1) {
        return arg1 < 0 ? arg0 : (int) ((double) arg0 * Math.sqrt((double) (16384 - arg1) * 1.220703125E-4D) + 0.5D);
    }

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "()V")
    private final void method703() {
        if (this.field1187 != 0) {
            if (this.field1196 == Integer.MIN_VALUE) {
                this.field1196 = 0;
            }
            this.field1187 = 0;
            this.method694();
        }
    }

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "()Z")
    public final boolean method704() {
        return this.field1187 != 0;
    }

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "()I")
    public final synchronized int method705() {
        return this.field1184 < 0 ? -this.field1184 : this.field1184;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)V")
    public final synchronized void method706(int arg0, int arg1, int arg2) {
        if (arg0 == 0) {
            this.method700(arg1, arg2);
        } else {
            int var4 = method702(arg1, arg2);
            int var5 = method697(arg1, arg2);
            if (this.field1183 == var4 && this.field1186 == var5) {
                this.field1187 = 0;
            } else {
                int var6 = arg1 - this.field1195;
                if (this.field1195 - arg1 > var6) {
                    var6 = this.field1195 - arg1;
                }
                if (var4 - this.field1183 > var6) {
                    var6 = var4 - this.field1183;
                }
                if (this.field1183 - var4 > var6) {
                    var6 = this.field1183 - var4;
                }
                if (var5 - this.field1186 > var6) {
                    var6 = var5 - this.field1186;
                }
                if (this.field1186 - var5 > var6) {
                    var6 = this.field1186 - var5;
                }
                if (arg0 > var6) {
                    arg0 = var6;
                }
                this.field1187 = arg0;
                this.field1196 = arg1;
                this.field1189 = arg2;
                this.field1185 = (arg1 - this.field1195) / arg0;
                this.field1182 = (var4 - this.field1183) / arg0;
                this.field1193 = (var5 - this.field1186) / arg0;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([B[IIIIIIILtk;)I")
    private static final int method707(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8) {
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
        arg8.field1192 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "()Lmi;")
    public final class409 method708() {
        return null;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "([B[IIIIIIILtk;)I")
    private static final int method709(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class79 arg8) {
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
        arg8.field1192 = var9 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "()I")
    public final int method710() {
        int var1 = this.field1195 * 3 >> 6;
        int var2 = (var1 >>> 31) + (var1 ^ var1 >> 31);
        if (this.field1188 == 0) {
            var2 -= this.field1192 * var2 / (((class294) super.field5726).field3966.length << 8);
        } else if (this.field1188 >= 0) {
            var2 -= this.field1191 * var2 / ((class294) super.field5726).field3966.length;
        }
        return var2 > 255 ? 255 : var2;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I[B[IIIIIIIIIILtk;)I")
    private static final int method711(int arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class79 arg12) {
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
        arg12.field1195 += (var19 - arg4) * arg12.field1185;
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
        arg12.field1183 = var15 >> 2;
        arg12.field1186 = var16 >> 2;
        arg12.field1192 = var13 << 8;
        return var20 >> 1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "([B[IIIIIIIILtk;)I")
    private static final int method712(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class79 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var10 - (var11 - 1)) > arg7) {
            var14 = arg7;
        }
        arg9.field1183 += (var14 - arg3) * arg9.field1182;
        arg9.field1186 += (var14 - arg3) * arg9.field1193;
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
        arg9.field1195 = var12 >> 2;
        arg9.field1192 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "([III)V")
    public final synchronized void method713(int[] arg0, int arg1, int arg2) {
        if (this.field1196 == 0 && this.field1187 == 0) {
            this.method683(arg2);
        } else {
            class294 var4 = (class294) super.field5726;
            int var5 = this.field1191 << 8;
            int var6 = this.field1194 << 8;
            int var7 = var4.field3966.length << 8;
            int var8 = var6 - var5;
            if (var8 <= 0) {
                this.field1188 = 0;
            }
            int var9 = arg1;
            int var10 = arg1 + arg2;
            if (this.field1192 < 0) {
                if (this.field1184 <= 0) {
                    this.method703();
                    this.method2367(5);
                    return;
                }
                this.field1192 = 0;
            }
            if (this.field1192 >= var7) {
                if (this.field1184 >= 0) {
                    this.method703();
                    this.method2367(5);
                    return;
                }
                this.field1192 = var7 - 1;
            }
            if (this.field1188 < 0) {
                if (this.field1190) {
                    if (this.field1184 < 0) {
                        var9 = this.method699(arg0, arg1, var5, var10, var4.field3966[this.field1191]);
                        if (this.field1192 >= var5) {
                            return;
                        }
                        this.field1192 = var5 + var5 - 1 - this.field1192;
                        this.field1184 = -this.field1184;
                    }
                    while (true) {
                        int var11 = this.method693(arg0, var9, var6, var10, var4.field3966[this.field1194 - 1]);
                        if (this.field1192 < var6) {
                            return;
                        }
                        this.field1192 = var6 + var6 - 1 - this.field1192;
                        this.field1184 = -this.field1184;
                        var9 = this.method699(arg0, var11, var5, var10, var4.field3966[this.field1191]);
                        if (this.field1192 >= var5) {
                            return;
                        }
                        this.field1192 = var5 + var5 - 1 - this.field1192;
                        this.field1184 = -this.field1184;
                    }
                } else if (this.field1184 < 0) {
                    while (true) {
                        var9 = this.method699(arg0, var9, var5, var10, var4.field3966[this.field1194 - 1]);
                        if (this.field1192 >= var5) {
                            return;
                        }
                        this.field1192 = var6 - 1 - (var6 - 1 - this.field1192) % var8;
                    }
                } else {
                    while (true) {
                        var9 = this.method693(arg0, var9, var6, var10, var4.field3966[this.field1191]);
                        if (this.field1192 < var6) {
                            return;
                        }
                        this.field1192 = (this.field1192 - var5) % var8 + var5;
                    }
                }
            } else {
                if (this.field1188 > 0) {
                    if (this.field1190) {
                        label130: {
                            if (this.field1184 < 0) {
                                var9 = this.method699(arg0, arg1, var5, var10, var4.field3966[this.field1191]);
                                if (this.field1192 >= var5) {
                                    return;
                                }
                                this.field1192 = var5 + var5 - 1 - this.field1192;
                                this.field1184 = -this.field1184;
                                if (--this.field1188 == 0) {
                                    break label130;
                                }
                            }
                            do {
                                var9 = this.method693(arg0, var9, var6, var10, var4.field3966[this.field1194 - 1]);
                                if (this.field1192 < var6) {
                                    return;
                                }
                                this.field1192 = var6 + var6 - 1 - this.field1192;
                                this.field1184 = -this.field1184;
                                if (--this.field1188 == 0) {
                                    break;
                                }
                                var9 = this.method699(arg0, var9, var5, var10, var4.field3966[this.field1191]);
                                if (this.field1192 >= var5) {
                                    return;
                                }
                                this.field1192 = var5 + var5 - 1 - this.field1192;
                                this.field1184 = -this.field1184;
                            } while (--this.field1188 != 0);
                        }
                    } else if (this.field1184 < 0) {
                        while (true) {
                            var9 = this.method699(arg0, var9, var5, var10, var4.field3966[this.field1194 - 1]);
                            if (this.field1192 >= var5) {
                                return;
                            }
                            int var12 = (var6 - 1 - this.field1192) / var8;
                            if (var12 >= this.field1188) {
                                this.field1192 += this.field1188 * var8;
                                this.field1188 = 0;
                                break;
                            }
                            this.field1192 += var8 * var12;
                            this.field1188 -= var12;
                        }
                    } else {
                        while (true) {
                            var9 = this.method693(arg0, var9, var6, var10, var4.field3966[this.field1191]);
                            if (this.field1192 < var6) {
                                return;
                            }
                            int var13 = (this.field1192 - var5) / var8;
                            if (var13 >= this.field1188) {
                                this.field1192 -= this.field1188 * var8;
                                this.field1188 = 0;
                                break;
                            }
                            this.field1192 -= var8 * var13;
                            this.field1188 -= var13;
                        }
                    }
                }
                if (this.field1184 < 0) {
                    this.method699(arg0, var9, 0, var10, 0);
                    if (this.field1192 < 0) {
                        this.field1192 = -1;
                        this.method703();
                        this.method2367(5);
                        return;
                    }
                } else {
                    this.method693(arg0, var9, var7, var10, 0);
                    if (this.field1192 >= var7) {
                        this.field1192 = var7;
                        this.method703();
                        this.method2367(5);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "()Z")
    private final boolean method714() {
        int var1 = this.field1196;
        int var2;
        int var3;
        if (var1 == Integer.MIN_VALUE) {
            var2 = 0;
            var3 = 0;
            var1 = 0;
        } else {
            var3 = method702(var1, this.field1189);
            var2 = method697(var1, this.field1189);
        }
        if (this.field1195 == var1 && this.field1183 == var3 && this.field1186 == var2) {
            if (this.field1196 == Integer.MIN_VALUE) {
                this.field1196 = 0;
                this.field1195 = this.field1183 = this.field1186 = 0;
                this.method2367(5);
                return true;
            } else {
                this.method694();
                return false;
            }
        } else {
            if (this.field1195 < var1) {
                this.field1185 = 1;
                this.field1187 = var1 - this.field1195;
            } else if (this.field1195 > var1) {
                this.field1185 = -1;
                this.field1187 = this.field1195 - var1;
            } else {
                this.field1185 = 0;
            }
            if (this.field1183 < var3) {
                this.field1182 = 1;
                if (this.field1187 == 0 || this.field1187 > var3 - this.field1183) {
                    this.field1187 = var3 - this.field1183;
                }
            } else if (this.field1183 > var3) {
                this.field1182 = -1;
                if (this.field1187 == 0 || this.field1187 > this.field1183 - var3) {
                    this.field1187 = this.field1183 - var3;
                }
            } else {
                this.field1182 = 0;
            }
            if (this.field1186 < var2) {
                this.field1193 = 1;
                if (this.field1187 == 0 || this.field1187 > var2 - this.field1186) {
                    this.field1187 = var2 - this.field1186;
                }
            } else if (this.field1186 > var2) {
                this.field1193 = -1;
                if (this.field1187 == 0 || this.field1187 > this.field1186 - var2) {
                    this.field1187 = this.field1186 - var2;
                }
            } else {
                this.field1193 = 0;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "()I")
    public final synchronized int method715() {
        return this.field1196 == Integer.MIN_VALUE ? 0 : this.field1196;
    }

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "(II)V")
    public final synchronized void method716(int arg0, int arg1) {
        this.method706(arg0, arg1, this.method682());
    }

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "(I)V")
    public final synchronized void method717(int arg0) {
        if (arg0 == 0) {
            this.method720(0);
            this.method2367(5);
        } else if (this.field1183 == 0 && this.field1186 == 0) {
            this.field1187 = 0;
            this.field1196 = 0;
            this.field1195 = 0;
            this.method2367(5);
        } else {
            int var2 = -this.field1195;
            if (this.field1195 > var2) {
                var2 = this.field1195;
            }
            if (-this.field1183 > var2) {
                var2 = -this.field1183;
            }
            if (this.field1183 > var2) {
                var2 = this.field1183;
            }
            if (-this.field1186 > var2) {
                var2 = -this.field1186;
            }
            if (this.field1186 > var2) {
                var2 = this.field1186;
            }
            if (arg0 > var2) {
                arg0 = var2;
            }
            this.field1187 = arg0;
            this.field1196 = Integer.MIN_VALUE;
            this.field1185 = -this.field1195 / arg0;
            this.field1182 = -this.field1183 / arg0;
            this.field1193 = -this.field1186 / arg0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II[B[IIIIIIIIIILtk;II)I")
    private static final int method718(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, class79 arg13, int arg14, int arg15) {
        arg13.field1195 -= arg13.field1185 * arg5;
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
        arg13.field1195 += arg13.field1185 * var22;
        arg13.field1183 = arg6;
        arg13.field1186 = arg7;
        arg13.field1192 = arg4;
        return var22;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lkf;II)V")
    private class79(class294 arg0, int arg1, int arg2) {
        super.field5726 = arg0;
        this.field1191 = arg0.field3968;
        this.field1194 = arg0.field3970;
        this.field1190 = arg0.field3969;
        this.field1184 = arg1;
        this.field1196 = arg2;
        this.field1189 = 8192;
        this.field1192 = 0;
        this.method694();
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "([B[IIIIIIIILtk;)I")
    private static final int method719(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class79 arg9) {
        int var10 = arg2 >> 8;
        int var11 = arg8 >> 8;
        int var12 = arg4 << 2;
        int var13 = arg5 << 2;
        int var14;
        if ((var14 = arg3 + var11 - var10) > arg7) {
            var14 = arg7;
        }
        arg9.field1183 += (var14 - arg3) * arg9.field1182;
        arg9.field1186 += (var14 - arg3) * arg9.field1193;
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
        arg9.field1195 = var12 >> 2;
        arg9.field1192 = var10 << 8;
        return arg3;
    }

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "(I)V")
    private final synchronized void method720(int arg0) {
        this.method700(arg0, this.method682());
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lkf;III)V")
    private class79(class294 arg0, int arg1, int arg2, int arg3) {
        super.field5726 = arg0;
        this.field1191 = arg0.field3968;
        this.field1194 = arg0.field3970;
        this.field1190 = arg0.field3969;
        this.field1184 = arg1;
        this.field1196 = arg2;
        this.field1189 = arg3;
        this.field1192 = 0;
        this.method694();
    }
}
