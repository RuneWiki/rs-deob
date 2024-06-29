import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class183 extends class150 {

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "[B")
    public byte[] field2873;

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "[I")
    private int[] field2872;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(III)V", line = 5)
    public final void method1259(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field2872.length; var4++) {
            int var5 = this.field2872[var4] >> 16 & 0xFF;
            int var6 = arg0 + var5;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 255) {
                var6 = 255;
            }
            int var7 = this.field2872[var4] >> 8 & 0xFF;
            int var8 = arg1 + var7;
            if (var8 < 0) {
                var8 = 0;
            } else if (var8 > 255) {
                var8 = 255;
            }
            int var9 = this.field2872[var4] & 0xFF;
            int var10 = arg2 + var9;
            if (var10 < 0) {
                var10 = 0;
            } else if (var10 > 255) {
                var10 = 255;
            }
            this.field2872[var4] = (var6 << 16) + (var8 << 8) + var10;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIIII)V", line = 50)
    public final void method1260(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var6 = this.field2341;
        int var7 = this.field2351;
        int var8 = 0;
        int var9 = 0;
        int var10 = this.field2352;
        int var11 = this.field2349;
        int var12 = (var10 << 16) / arg2;
        int var13 = (var11 << 16) / arg3;
        if (this.field2353 > 0) {
            int var14 = ((this.field2353 << 16) + var12 - 1) / var12;
            arg0 += var14;
            var8 += var12 * var14 - (this.field2353 << 16);
        }
        if (this.field2344 > 0) {
            int var15 = ((this.field2344 << 16) + var13 - 1) / var13;
            arg1 += var15;
            var9 += var13 * var15 - (this.field2344 << 16);
        }
        if (var6 < var10) {
            arg2 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        if (var7 < var11) {
            arg3 = ((var7 << 16) + var13 - var9 - 1) / var13;
        }
        int var16 = class34.field563 * arg1 + arg0;
        int var17 = class34.field563 - arg2;
        if (arg1 + arg3 > class34.field570) {
            arg3 -= arg1 + arg3 - class34.field570;
        }
        if (arg1 < class34.field566) {
            int var18 = class34.field566 - arg1;
            arg3 -= var18;
            var16 += class34.field563 * var18;
            var9 += var13 * var18;
        }
        if (arg0 + arg2 > class34.field567) {
            int var19 = arg0 + arg2 - class34.field567;
            arg2 -= var19;
            var17 += var19;
        }
        if (arg0 < class34.field564) {
            int var20 = class34.field564 - arg0;
            arg2 -= var20;
            var16 += var20;
            var8 += var12 * var20;
            var17 += var20;
        }
        method1264(class34.field571, this.field2873, this.field2872, var8, var9, var16, var17, arg2, arg3, var12, var13, var6, arg4);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 125)
    private static final void method1261(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; var13++) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; var15++) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "()V", line = 158)
    public final void method1262() {
        int var1 = 0;
        int var2 = this.field2873.length - 7;
        while (var1 < var2) {
            this.field2873[var1++] = 0;
            this.field2873[var1++] = 0;
            this.field2873[var1++] = 0;
            this.field2873[var1++] = 0;
            this.field2873[var1++] = 0;
            this.field2873[var1++] = 0;
            this.field2873[var1++] = 0;
            this.field2873[var1++] = 0;
        }
        var2 += 7;
        while (var1 < var2) {
            this.field2873[var1++] = 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 182)
    private static final void method1263(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg4++];
                if (var14 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var17 & 0xFF];
                }
            }
            for (int var18 = var11; var18 < 0; var18++) {
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([I[B[IIIIIIIIIII)V", line = 245)
    private static final void method1264(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3;
        int var14 = arg12 >> 16 & 0xFF;
        int var15 = arg12 >> 8 & 0xFF;
        int var16 = arg12 & 0xFF;
        for (int var17 = -arg8; var17 < 0; var17++) {
            int var18 = (arg4 >> 16) * arg11;
            for (int var19 = -arg7; var19 < 0; var19++) {
                byte var20 = arg1[(arg3 >> 16) + var18];
                if (var20 == 0) {
                    arg5++;
                } else {
                    int var21 = arg2[var20 & 0xFF];
                    int var22 = var21 >> 16 & 0xFF;
                    int var23 = var21 >> 8 & 0xFF;
                    int var24 = var21 & 0xFF;
                    arg0[arg5++] = (var16 * var24 >> 8) + (var14 * var22 >> 8 << 16) + (var15 * var23 >> 8 << 8);
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var13;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "()V", line = 300)
    public final void method1265() {
        byte[] var1 = new byte[this.field2351 * this.field2341];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2341; var3++) {
            for (int var4 = this.field2351 - 1; var4 >= 0; var4--) {
                var1[var2++] = this.field2873[this.field2341 * var4 + var3];
            }
        }
        this.field2873 = var1;
        int var5 = this.field2344;
        this.field2344 = this.field2353;
        this.field2353 = this.field2349 - this.field2351 - var5;
        int var6 = this.field2351;
        this.field2351 = this.field2341;
        this.field2341 = var6;
        int var7 = this.field2349;
        this.field2349 = this.field2352;
        this.field2352 = var7;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V", line = 342)
    public final void method111(int arg0, int arg1, int arg2) {
        int var4 = this.field2353 + arg0;
        int var5 = this.field2344 + arg1;
        int var6 = class34.field563 * var5 + var4;
        int var7 = 0;
        int var8 = this.field2351;
        int var9 = this.field2341;
        int var10 = class34.field563 - var9;
        int var11 = 0;
        if (var5 < class34.field566) {
            int var12 = class34.field566 - var5;
            var8 -= var12;
            var5 = class34.field566;
            var7 += var9 * var12;
            var6 += class34.field563 * var12;
        }
        if (var5 + var8 > class34.field570) {
            var8 -= var5 + var8 - class34.field570;
        }
        if (var4 < class34.field564) {
            int var13 = class34.field564 - var4;
            var9 -= var13;
            var4 = class34.field564;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class34.field567) {
            int var14 = var4 + var9 - class34.field567;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method1267(class34.field571, this.field2873, this.field2872, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "()V", line = 396)
    public final void method1266() {
        if (this.field2352 == this.field2341 && this.field2351 == this.field2349) {
            return;
        }
        byte[] var1 = new byte[this.field2352 * this.field2349];
        int var2 = 0;
        for (int var3 = 0; var3 < this.field2351; var3++) {
            for (int var4 = 0; var4 < this.field2341; var4++) {
                var1[(this.field2344 + var3) * this.field2352 + this.field2353 + var4] = this.field2873[var2++];
            }
        }
        this.field2873 = var1;
        this.field2341 = this.field2352;
        this.field2351 = this.field2349;
        this.field2353 = 0;
        this.field2344 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 428)
    private static final void method1267(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg2[var13 & 0xFF];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IIII)V", line = 464)
    public final void method1268(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field2341;
        int var6 = this.field2351;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field2352;
        int var10 = this.field2349;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field2353 > 0) {
            int var13 = ((this.field2353 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field2353 << 16);
        }
        if (this.field2344 > 0) {
            int var14 = ((this.field2344 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field2344 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class34.field563 * arg1 + arg0;
        int var16 = class34.field563 - arg2;
        if (arg1 + arg3 > class34.field570) {
            arg3 -= arg1 + arg3 - class34.field570;
        }
        if (arg1 < class34.field566) {
            int var17 = class34.field566 - arg1;
            arg3 -= var17;
            var15 += class34.field563 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class34.field567) {
            int var18 = arg0 + arg2 - class34.field567;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class34.field564) {
            int var19 = class34.field564 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method1261(class34.field571, this.field2873, this.field2872, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(II)V", line = 538)
    public final void method113(int arg0, int arg1) {
        int var3 = this.field2353 + arg0;
        int var4 = this.field2344 + arg1;
        int var5 = class34.field563 * var4 + var3;
        int var6 = 0;
        int var7 = this.field2351;
        int var8 = this.field2341;
        int var9 = class34.field563 - var8;
        int var10 = 0;
        if (var4 < class34.field566) {
            int var11 = class34.field566 - var4;
            var7 -= var11;
            var4 = class34.field566;
            var6 += var8 * var11;
            var5 += class34.field563 * var11;
        }
        if (var4 + var7 > class34.field570) {
            var7 -= var4 + var7 - class34.field570;
        }
        if (var3 < class34.field564) {
            int var12 = class34.field564 - var3;
            var8 -= var12;
            var3 = class34.field564;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class34.field567) {
            int var13 = var3 + var8 - class34.field567;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method1263(class34.field571, this.field2873, this.field2872, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 593)
    public class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        this.field2352 = arg0;
        this.field2349 = arg1;
        this.field2353 = arg2;
        this.field2344 = arg3;
        this.field2341 = arg4;
        this.field2351 = arg5;
        this.field2873 = arg6;
        this.field2872 = arg7;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(III)V", line = 603)
    public class183(int arg0, int arg1, int arg2) {
        this.field2352 = this.field2341 = arg0;
        this.field2349 = this.field2351 = arg1;
        this.field2353 = this.field2344 = 0;
        this.field2873 = new byte[arg0 * arg1];
        this.field2872 = new int[arg2];
    }
}
