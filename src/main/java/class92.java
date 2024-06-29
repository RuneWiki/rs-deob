import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class92 extends class485 {

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "Lfu;")
    private class171 field1358;

    @OriginalMember(owner = "client!vr", name = "H", descriptor = "[I")
    private int[] field1362;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "[I")
    private int[] field1357;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "[[B")
    private byte[][] field1359;

    @OriginalMember(owner = "client!vr", name = "G", descriptor = "[I")
    private int[] field1361;

    @OriginalMember(owner = "client!vr", name = "F", descriptor = "[I")
    private int[] field1360;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(CIIIZLvb;II)V")
    public final void method258(char arg0, int arg1, int arg2, int arg3, boolean arg4, class90 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method259(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field1360[arg0] + arg1;
        int var10 = this.field1361[arg0] + arg2;
        int var11 = this.field1362[arg0];
        int var12 = this.field1357[arg0];
        int var13 = this.field1358.field2536;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field1358.field2531) {
            int var18 = this.field1358.field2531 - var10;
            var12 -= var18;
            var10 = this.field1358.field2531;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field1358.field2527) {
            var12 -= var10 + var12 - this.field1358.field2527;
        }
        if (var9 < this.field1358.field2510) {
            int var19 = this.field1358.field2510 - var9;
            var11 -= var19;
            var9 = this.field1358.field2510;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field1358.field2541) {
            int var20 = var9 + var11 - this.field1358.field2541;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method616(this.field1359[arg0], this.field1358.field2508, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field1362[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([B[IIIIIIII)V")
    private final void method615(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        for (int var10 = -arg6; var10 < 0; var10++) {
            for (int var11 = -arg5; var11 < 0; var11++) {
                int var12 = arg0[arg3++] & 0xFF;
                if (var12 == 0) {
                    arg4++;
                } else {
                    int var13 = ((arg2 & 0xFF00FF) * var12 & 0xFF00FF00) + ((arg2 & 0xFF00) * var12 & 0xFF0000) >> 8;
                    int var14 = 256 - var12;
                    int var15 = arg1[arg4];
                    arg1[arg4++] = (((var15 & 0xFF00FF) * var14 & 0xFF00FF00) + ((var15 & 0xFF00) * var14 & 0xFF0000) >> 8) + var13;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lfu;Lss;[Lua;[I[I)V")
    public class92(class171 arg0, class76 arg1, class140[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field1358 = arg0;
        this.field1358 = arg0;
        this.field1362 = arg3;
        this.field1357 = arg4;
        this.field1359 = new byte[arg2.length][];
        this.field1361 = new int[arg2.length];
        this.field1360 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field1359[var6] = arg2[var6].field1994;
            this.field1361[var6] = arg2[var6].field1988;
            this.field1360[var6] = arg2[var6].field1992;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "([B[IIIIIIIIIIILvb;II)V")
    private final void method616(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class90 arg12, int arg13, int arg14) {
        class259 var16 = (class259) arg12;
        int[] var17 = var16.field3610;
        int[] var18 = var16.field3615;
        int var19 = arg9 - this.field1358.field2510;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field1358.field2536;
            arg3 += (arg14 - arg10) * arg11;
        }
        int var21 = var17.length + arg14 < arg6 + arg10 ? var17.length + arg14 : arg6 + arg10;
        for (int var22 = var20; var22 < var21; var22++) {
            int var23 = var17[var22 - arg14] + arg13;
            int var24 = var18[var22 - arg14];
            int var25 = arg5;
            if (var19 > var23) {
                int var26 = var19 - var23;
                if (var26 >= var24) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                var24 -= var26;
            } else {
                int var27 = var23 - var19;
                if (var27 >= arg5) {
                    arg3 += arg5 + arg8;
                    arg4 += arg5 + arg7;
                    continue;
                }
                arg3 += var27;
                var25 = arg5 - var27;
                arg4 += var27;
            }
            int var28 = 0;
            if (var25 < var24) {
                var24 = var25;
            } else {
                var28 = var25 - var24;
            }
            for (int var29 = -var24; var29 < 0; var29++) {
                int var30 = arg0[arg3++] & 0xFF;
                if (var30 == 0) {
                    arg4++;
                } else {
                    int var31 = ((arg2 & 0xFF00FF) * var30 & 0xFF00FF00) + ((arg2 & 0xFF00) * var30 & 0xFF0000) >> 8;
                    int var32 = 256 - var30;
                    int var33 = arg1[arg4];
                    arg1[arg4++] = (((var33 & 0xFF00FF) * var32 & 0xFF00FF00) + ((var33 & 0xFF00) * var32 & 0xFF0000) >> 8) + var31;
                }
            }
            arg3 += arg8 + var28;
            arg4 += arg7 + var28;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(CIIIZ)V")
    public final void method259(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field1360[arg0] + arg1;
        int var7 = this.field1361[arg0] + arg2;
        int var8 = this.field1362[arg0];
        int var9 = this.field1357[arg0];
        int var10 = this.field1358.field2536;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field1358.field2531) {
            int var15 = this.field1358.field2531 - var7;
            var9 -= var15;
            var7 = this.field1358.field2531;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field1358.field2527) {
            var9 -= var7 + var9 - this.field1358.field2527;
        }
        if (var6 < this.field1358.field2510) {
            int var16 = this.field1358.field2510 - var6;
            var8 -= var16;
            var6 = this.field1358.field2510;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field1358.field2541) {
            int var17 = var6 + var8 - this.field1358.field2541;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method615(this.field1359[arg0], this.field1358.field2508, arg3, var14, var11, var8, var9, var12, var13);
        }
    }
}
