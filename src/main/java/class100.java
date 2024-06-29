import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class100 extends class298 {

    @OriginalMember(owner = "client!fr", name = "B", descriptor = "Lhm;")
    private class280 field1174;

    @OriginalMember(owner = "client!fr", name = "E", descriptor = "[I")
    private int[] field1177;

    @OriginalMember(owner = "client!fr", name = "F", descriptor = "[I")
    private int[] field1178;

    @OriginalMember(owner = "client!fr", name = "D", descriptor = "[[B")
    private byte[][] field1176;

    @OriginalMember(owner = "client!fr", name = "C", descriptor = "[I")
    private int[] field1175;

    @OriginalMember(owner = "client!fr", name = "G", descriptor = "[I")
    private int[] field1179;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([B[IIIIIIIIIIILgo;II)V", line = 7)
    private final void method540(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class175 arg12, int arg13, int arg14) {
        class410 var16 = (class410) arg12;
        int[] var17 = var16.field5931;
        int[] var18 = var16.field5934;
        int var19 = arg9 - this.field1174.field3843;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field1174.field3803;
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

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(CIIIZLgo;II)V", line = 105)
    public final void method62(char arg0, int arg1, int arg2, int arg3, boolean arg4, class175 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method59(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field1179[arg0] + arg1;
        int var10 = this.field1175[arg0] + arg2;
        int var11 = this.field1177[arg0];
        int var12 = this.field1178[arg0];
        int var13 = this.field1174.field3803;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field1174.field3846) {
            int var18 = this.field1174.field3846 - var10;
            var12 -= var18;
            var10 = this.field1174.field3846;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field1174.field3804) {
            var12 -= var10 + var12 - this.field1174.field3804;
        }
        if (var9 < this.field1174.field3843) {
            int var19 = this.field1174.field3843 - var9;
            var11 -= var19;
            var9 = this.field1174.field3843;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field1174.field3845) {
            int var20 = var9 + var11 - this.field1174.field3845;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method540(this.field1176[arg0], this.field1174.field3802, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field1177[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!fr", name = "<init>", descriptor = "(Lhm;Ljp;[Lv;[I[I)V", line = 167)
    public class100(class280 arg0, class402 arg1, class241[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field1174 = arg0;
        this.field1174 = arg0;
        this.field1177 = arg3;
        this.field1178 = arg4;
        this.field1176 = new byte[arg2.length][];
        this.field1175 = new int[arg2.length];
        this.field1179 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field1176[var6] = arg2[var6].field3281;
            this.field1175[var6] = arg2[var6].field3283;
            this.field1179[var6] = arg2[var6].field3278;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(CIIIZ)V", line = 188)
    public final void method59(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field1179[arg0] + arg1;
        int var7 = this.field1175[arg0] + arg2;
        int var8 = this.field1177[arg0];
        int var9 = this.field1178[arg0];
        int var10 = this.field1174.field3803;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field1174.field3846) {
            int var15 = this.field1174.field3846 - var7;
            var9 -= var15;
            var7 = this.field1174.field3846;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field1174.field3804) {
            var9 -= var7 + var9 - this.field1174.field3804;
        }
        if (var6 < this.field1174.field3843) {
            int var16 = this.field1174.field3843 - var6;
            var8 -= var16;
            var6 = this.field1174.field3843;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field1174.field3845) {
            int var17 = var6 + var8 - this.field1174.field3845;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method541(this.field1176[arg0], this.field1174.field3802, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "([B[IIIIIIII)V", line = 246)
    private final void method541(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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
