import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class364 extends class61 {

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "Lsq;")
    private class27 field5010;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "[I")
    private int[] field5009;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "[I")
    private int[] field5008;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "[[B")
    private byte[][] field5005;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "[I")
    private int[] field5007;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "[I")
    private int[] field5006;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([B[IIIIIIII)V", line = 5)
    private final void method2232(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = -(arg5 >> 2);
        int var11 = -(arg5 & 0x3);
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            for (int var14 = var11; var14 < 0; var14++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(CIIIZ)V", line = 60)
    public final void method374(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field5006[arg0] + arg1;
        int var7 = this.field5007[arg0] + arg2;
        int var8 = this.field5009[arg0];
        int var9 = this.field5008[arg0];
        int var10 = this.field5010.field360;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field5010.field376) {
            int var15 = this.field5010.field376 - var7;
            var9 -= var15;
            var7 = this.field5010.field376;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field5010.field355) {
            var9 -= var7 + var9 - this.field5010.field355;
        }
        if (var6 < this.field5010.field373) {
            int var16 = this.field5010.field373 - var6;
            var8 -= var16;
            var6 = this.field5010.field373;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field5010.field348) {
            int var17 = var6 + var8 - this.field5010.field348;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 <= 0 || var9 <= 0) {
            return;
        }
        if ((arg3 & 0xFF000000) == -16777216) {
            this.method2232(this.field5005[arg0], this.field5010.field361, arg3, var14, var11, var8, var9, var12, var13);
        } else if ((arg3 & 0xFF000000) != 0) {
            this.method2233(this.field5005[arg0], this.field5010.field361, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([B[IIIIIIII)V", line = 123)
    private final void method2233(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var10 = arg2 >>> 24;
        int var11 = 255 - var10;
        for (int var12 = -arg6; var12 < 0; var12++) {
            for (int var13 = -arg5; var13 < 0; var13++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    int var14 = ((arg2 & 0xFF00FF) * var10 & 0xFF00FF00) + ((arg2 & 0xFF00) * var10 & 0xFF0000) >> 8;
                    int var15 = arg1[arg4];
                    arg1[arg4++] = (((var15 & 0xFF00FF) * var11 & 0xFF00FF00) + ((var15 & 0xFF00) * var11 & 0xFF0000) >> 8) + var14;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(CIIIZLde;II)V", line = 159)
    public final void method373(char arg0, int arg1, int arg2, int arg3, boolean arg4, class165 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method374(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field5006[arg0] + arg1;
        int var10 = this.field5007[arg0] + arg2;
        int var11 = this.field5009[arg0];
        int var12 = this.field5008[arg0];
        int var13 = this.field5010.field360;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field5010.field376) {
            int var18 = this.field5010.field376 - var10;
            var12 -= var18;
            var10 = this.field5010.field376;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field5010.field355) {
            var12 -= var10 + var12 - this.field5010.field355;
        }
        if (var9 < this.field5010.field373) {
            int var19 = this.field5010.field373 - var9;
            var11 -= var19;
            var9 = this.field5010.field373;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field5010.field348) {
            int var20 = var9 + var11 - this.field5010.field348;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 <= 0 || var12 <= 0) {
            return;
        }
        if ((arg3 & 0xFF000000) == -16777216) {
            this.method2235(this.field5005[arg0], this.field5010.field361, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field5009[arg0], arg5, arg6, arg7);
        } else {
            this.method2234(this.field5005[arg0], this.field5010.field361, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field5009[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([B[IIIIIIIIIIILde;II)V", line = 226)
    private final void method2234(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class165 arg12, int arg13, int arg14) {
        class231 var16 = (class231) arg12;
        int[] var17 = var16.field3255;
        int[] var18 = var16.field3254;
        int var19 = arg9 - this.field5010.field373;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field5010.field360;
            arg3 += (arg14 - arg10) * arg11;
        }
        int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
        int var22 = arg2 >>> 24;
        int var23 = 255 - var22;
        for (int var24 = var20; var24 < var21; var24++) {
            int var25 = var17[var24 - arg14] + arg13;
            int var26 = var18[var24 - arg14];
            int var27 = arg5;
            if (var19 > var25) {
                int var28 = var19 - var25;
                if (var28 >= var26) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                var26 -= var28;
            } else {
                int var29 = var25 - var19;
                if (var29 >= arg5) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                arg3 += var29;
                var27 = arg5 - var29;
                arg4 += var29;
            }
            int var30 = 0;
            if (var27 < var26) {
                var26 = var27;
            } else {
                var30 = var27 - var26;
            }
            for (int var31 = -var26; var31 < 0; var31++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    int var32 = ((arg2 & 0xFF00FF) * var22 & 0xFF00FF00) + ((arg2 & 0xFF00) * var22 & 0xFF0000) >> 8;
                    int var33 = arg1[arg4];
                    arg1[arg4++] = (((var33 & 0xFF00FF) * var23 & 0xFF00FF00) + ((var33 & 0xFF00) * var23 & 0xFF0000) >> 8) + var32;
                }
            }
            arg3 += arg8 + var30;
            arg4 += arg7 + var30;
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lsq;Lci;[Ljf;[I[I)V", line = 321)
    public class364(class27 arg0, class389 arg1, class96[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field5010 = arg0;
        this.field5009 = arg3;
        this.field5008 = arg4;
        this.field5005 = new byte[arg2.length][];
        this.field5007 = new int[arg2.length];
        this.field5006 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field5005[var6] = arg2[var6].field1325;
            this.field5007[var6] = arg2[var6].field1322;
            this.field5006[var6] = arg2[var6].field1319;
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "([B[IIIIIIIIIIILde;II)V", line = 344)
    private final void method2235(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class165 arg12, int arg13, int arg14) {
        class231 var16 = (class231) arg12;
        int[] var17 = var16.field3255;
        int[] var18 = var16.field3254;
        int var19 = arg10;
        if (arg14 > arg10) {
            var19 = arg14;
            arg4 += (arg14 - arg10) * this.field5010.field360;
            arg3 += (arg14 - arg10) * arg11;
        }
        int var20 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
        for (int var21 = var19; var21 < var20; var21++) {
            int var22 = var17[var21 - arg14] + arg13;
            int var23 = var18[var21 - arg14];
            int var24 = arg5;
            if (arg9 > var22) {
                int var25 = arg9 - var22;
                if (var25 >= var23) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                var23 -= var25;
            } else {
                int var26 = var22 - arg9;
                if (var26 >= arg5) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                arg3 += var26;
                var24 = arg5 - var26;
                arg4 += var26;
            }
            int var27 = 0;
            if (var24 < var23) {
                var23 = var24;
            } else {
                var27 = var24 - var23;
            }
            for (int var28 = 0; var28 < var23; var28++) {
                if (arg0[arg3++] == 0) {
                    arg4++;
                } else {
                    arg1[arg4++] = arg2;
                }
            }
            arg3 += arg8 + var27;
            arg4 += arg7 + var27;
        }
    }
}
