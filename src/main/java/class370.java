import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class370 extends class299 {

    @OriginalMember(owner = "client!ao", name = "J", descriptor = "Lf;")
    private class195 field5691;

    @OriginalMember(owner = "client!ao", name = "G", descriptor = "[I")
    private int[] field5688;

    @OriginalMember(owner = "client!ao", name = "I", descriptor = "[I")
    private int[] field5690;

    @OriginalMember(owner = "client!ao", name = "E", descriptor = "[[B")
    private byte[][] field5687;

    @OriginalMember(owner = "client!ao", name = "H", descriptor = "[I")
    private int[] field5689;

    @OriginalMember(owner = "client!ao", name = "C", descriptor = "[I")
    private int[] field5686;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(CIIIZLta;II)V")
    public final void method70(char arg0, int arg1, int arg2, int arg3, boolean arg4, class453 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method68(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field5686[arg0] + arg1;
        int var10 = this.field5689[arg0] + arg2;
        int var11 = this.field5688[arg0];
        int var12 = this.field5690[arg0];
        int var13 = this.field5691.field2950;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field5691.field2919) {
            int var18 = this.field5691.field2919 - var10;
            var12 -= var18;
            var10 = this.field5691.field2919;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field5691.field2916) {
            var12 -= var10 + var12 - this.field5691.field2916;
        }
        if (var9 < this.field5691.field2914) {
            int var19 = this.field5691.field2914 - var9;
            var11 -= var19;
            var9 = this.field5691.field2914;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field5691.field2942) {
            int var20 = var9 + var11 - this.field5691.field2942;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method2411(this.field5687[arg0], this.field5691.field2940, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field5688[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!ao", name = "B", descriptor = "(CIIIZ)V")
    public final void method68(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field5686[arg0] + arg1;
        int var7 = this.field5689[arg0] + arg2;
        int var8 = this.field5688[arg0];
        int var9 = this.field5690[arg0];
        int var10 = this.field5691.field2950;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field5691.field2919) {
            int var15 = this.field5691.field2919 - var7;
            var9 -= var15;
            var7 = this.field5691.field2919;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field5691.field2916) {
            var9 -= var7 + var9 - this.field5691.field2916;
        }
        if (var6 < this.field5691.field2914) {
            int var16 = this.field5691.field2914 - var6;
            var8 -= var16;
            var6 = this.field5691.field2914;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field5691.field2942) {
            int var17 = var6 + var8 - this.field5691.field2942;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method2412(this.field5687[arg0], this.field5691.field2940, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([B[IIIIIIIIIIILta;II)V")
    private final void method2411(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class453 arg12, int arg13, int arg14) {
        class396 var16 = (class396) arg12;
        int[] var17 = var16.field5990;
        int[] var18 = var16.field5989;
        int var19 = arg9 - this.field5691.field2914;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field5691.field2950;
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

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "([B[IIIIIIII)V")
    private final void method2412(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!ao", name = "<init>", descriptor = "(Lf;Laq;[Lok;[I[I)V")
    public class370(class195 arg0, class340 arg1, class175[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field5691 = arg0;
        this.field5691 = arg0;
        this.field5688 = arg3;
        this.field5690 = arg4;
        this.field5687 = new byte[arg2.length][];
        this.field5689 = new int[arg2.length];
        this.field5686 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field5687[var6] = arg2[var6].field2572;
            this.field5689[var6] = arg2[var6].field2579;
            this.field5686[var6] = arg2[var6].field2575;
        }
    }
}
