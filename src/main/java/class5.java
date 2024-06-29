import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class314 {

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Lbc;")
    private class246 field72;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "[I")
    private int[] field73;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "[I")
    private int[] field74;

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "[[B")
    private byte[][] field71;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "[I")
    private int[] field76;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "[I")
    private int[] field75;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([B[IIIIIIIIIIILma;II)V", line = 5)
    private final void method40(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class10 arg12, int arg13, int arg14) {
        class394 var16 = (class394) arg12;
        int[] var17 = var16.field5792;
        int[] var18 = var16.field5791;
        int var19 = arg9 - this.field72.field3658;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field72.field3660;
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

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(CIIIZLma;II)V", line = 105)
    public final void method41(char arg0, int arg1, int arg2, int arg3, boolean arg4, class10 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method42(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field75[arg0] + arg1;
        int var10 = this.field76[arg0] + arg2;
        int var11 = this.field73[arg0];
        int var12 = this.field74[arg0];
        int var13 = this.field72.field3660;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field72.field3651) {
            int var18 = this.field72.field3651 - var10;
            var12 -= var18;
            var10 = this.field72.field3651;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field72.field3644) {
            var12 -= var10 + var12 - this.field72.field3644;
        }
        if (var9 < this.field72.field3658) {
            int var19 = this.field72.field3658 - var9;
            var11 -= var19;
            var9 = this.field72.field3658;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field72.field3620) {
            int var20 = var9 + var11 - this.field72.field3620;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method40(this.field71[arg0], this.field72.field3622, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field73[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!dc", name = "OA", descriptor = "(CIIIZ)V", line = 167)
    public final void method42(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field75[arg0] + arg1;
        int var7 = this.field76[arg0] + arg2;
        int var8 = this.field73[arg0];
        int var9 = this.field74[arg0];
        int var10 = this.field72.field3660;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field72.field3651) {
            int var15 = this.field72.field3651 - var7;
            var9 -= var15;
            var7 = this.field72.field3651;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field72.field3644) {
            var9 -= var7 + var9 - this.field72.field3644;
        }
        if (var6 < this.field72.field3658) {
            int var16 = this.field72.field3658 - var6;
            var8 -= var16;
            var6 = this.field72.field3658;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field72.field3620) {
            int var17 = var6 + var8 - this.field72.field3620;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method43(this.field71[arg0], this.field72.field3622, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lbc;Lgt;[Lbb;[I[I)V", line = 223)
    public class5(class246 arg0, class316 arg1, class218[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field72 = arg0;
        this.field72 = arg0;
        this.field73 = arg3;
        this.field74 = arg4;
        this.field71 = new byte[arg2.length][];
        this.field76 = new int[arg2.length];
        this.field75 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field71[var6] = arg2[var6].field3145;
            this.field76[var6] = arg2[var6].field3146;
            this.field75[var6] = arg2[var6].field3142;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([B[IIIIIIII)V", line = 247)
    private final void method43(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
}
