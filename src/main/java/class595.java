import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class595 extends class60 {

    @OriginalMember(owner = "client!rj", name = "y", descriptor = "Lao;")
    private class289 field8138;

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "[I")
    private int[] field8135;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "[I")
    private int[] field8137;

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "[[B")
    private byte[][] field8136;

    @OriginalMember(owner = "client!rj", name = "A", descriptor = "[I")
    private int[] field8140;

    @OriginalMember(owner = "client!rj", name = "z", descriptor = "[I")
    private int[] field8139;

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lao;Loea;[Lrh;[I[I)V", line = 3)
    public class595(class289 arg0, class597 arg1, class267[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field8138 = arg0;
        this.field8138 = arg0;
        this.field8135 = arg3;
        this.field8137 = arg4;
        this.field8136 = new byte[arg2.length][];
        this.field8140 = new int[arg2.length];
        this.field8139 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class267 var7 = arg2[var6];
            if (var7.field3777 == null) {
                byte[] var8 = var7.field3781;
                byte[] var9 = this.field8136[var6] = new byte[var8.length];
                for (int var10 = 0; var10 < var8.length; var10++) {
                    var9[var10] = (byte) (var8[var10] == 0 ? 0 : -1);
                }
            } else {
                this.field8136[var6] = var7.field3777;
            }
            this.field8140[var6] = var7.field3782;
            this.field8139[var6] = var7.field3785;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([B[IIIIIIIIIIILaa;II)V", line = 46)
    private final void method3384(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class487 arg12, int arg13, int arg14) {
        class301 var16 = (class301) arg12;
        int[] var17 = var16.field4196;
        int[] var18 = var16.field4197;
        int var19 = arg9 - this.field8138.field4039;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field8138.field4020;
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

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "([B[IIIIIIII)V", line = 143)
    private final void method3385(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(CIIIZLaa;II)V", line = 177)
    public final void method132(char arg0, int arg1, int arg2, int arg3, boolean arg4, class487 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method130(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field8139[arg0] + arg1;
        int var10 = this.field8140[arg0] + arg2;
        int var11 = this.field8135[arg0];
        int var12 = this.field8137[arg0];
        int var13 = this.field8138.field4020;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field8138.field4019) {
            int var18 = this.field8138.field4019 - var10;
            var12 -= var18;
            var10 = this.field8138.field4019;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field8138.field4046) {
            var12 -= var10 + var12 - this.field8138.field4046;
        }
        if (var9 < this.field8138.field4039) {
            int var19 = this.field8138.field4039 - var9;
            var11 -= var19;
            var9 = this.field8138.field4039;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field8138.field4050) {
            int var20 = var9 + var11 - this.field8138.field4050;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method3384(this.field8136[arg0], this.field8138.field4026, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field8135[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!rj", name = "fa", descriptor = "(CIIIZ)V", line = 240)
    public final void method130(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field8139[arg0] + arg1;
        int var7 = this.field8140[arg0] + arg2;
        int var8 = this.field8135[arg0];
        int var9 = this.field8137[arg0];
        int var10 = this.field8138.field4020;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field8138.field4019) {
            int var15 = this.field8138.field4019 - var7;
            var9 -= var15;
            var7 = this.field8138.field4019;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field8138.field4046) {
            var9 -= var7 + var9 - this.field8138.field4046;
        }
        if (var6 < this.field8138.field4039) {
            int var16 = this.field8138.field4039 - var6;
            var8 -= var16;
            var6 = this.field8138.field4039;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field8138.field4050) {
            int var17 = var6 + var8 - this.field8138.field4050;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method3385(this.field8136[arg0], this.field8138.field4026, arg3, var14, var11, var8, var9, var12, var13);
        }
    }
}
