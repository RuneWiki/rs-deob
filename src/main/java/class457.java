import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!no")
public class class457 extends class345 {

    @OriginalMember(owner = "client!no", name = "z", descriptor = "Lj;")
    private class349 field6195;

    @OriginalMember(owner = "client!no", name = "u", descriptor = "[I")
    private int[] field6190;

    @OriginalMember(owner = "client!no", name = "v", descriptor = "[I")
    private int[] field6191;

    @OriginalMember(owner = "client!no", name = "w", descriptor = "[[B")
    private byte[][] field6192;

    @OriginalMember(owner = "client!no", name = "y", descriptor = "[I")
    private int[] field6194;

    @OriginalMember(owner = "client!no", name = "x", descriptor = "[I")
    private int[] field6193;

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(CIIIZ)V")
    public final void method1314(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field6193[arg0] + arg1;
        int var7 = this.field6194[arg0] + arg2;
        int var8 = this.field6190[arg0];
        int var9 = this.field6191[arg0];
        int var10 = this.field6195.field4833;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field6195.field4825) {
            int var15 = this.field6195.field4825 - var7;
            var9 -= var15;
            var7 = this.field6195.field4825;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field6195.field4828) {
            var9 -= var7 + var9 - this.field6195.field4828;
        }
        if (var6 < this.field6195.field4842) {
            int var16 = this.field6195.field4842 - var6;
            var8 -= var16;
            var6 = this.field6195.field4842;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field6195.field4820) {
            int var17 = var6 + var8 - this.field6195.field4820;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method2688(this.field6192[arg0], this.field6195.field4827, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "(CIIIZLkf;II)V")
    public final void method1319(char arg0, int arg1, int arg2, int arg3, boolean arg4, class152 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method1314(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field6193[arg0] + arg1;
        int var10 = this.field6194[arg0] + arg2;
        int var11 = this.field6190[arg0];
        int var12 = this.field6191[arg0];
        int var13 = this.field6195.field4833;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field6195.field4825) {
            int var18 = this.field6195.field4825 - var10;
            var12 -= var18;
            var10 = this.field6195.field4825;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field6195.field4828) {
            var12 -= var10 + var12 - this.field6195.field4828;
        }
        if (var9 < this.field6195.field4842) {
            int var19 = this.field6195.field4842 - var9;
            var11 -= var19;
            var9 = this.field6195.field4842;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field6195.field4820) {
            int var20 = var9 + var11 - this.field6195.field4820;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method2689(this.field6192[arg0], this.field6195.field4827, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field6190[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!no", name = "<init>", descriptor = "(Lj;Lvi;[Ldk;[I[I)V")
    public class457(class349 arg0, class347 arg1, class325[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field6195 = arg0;
        this.field6195 = arg0;
        this.field6190 = arg3;
        this.field6191 = arg4;
        this.field6192 = new byte[arg2.length][];
        this.field6194 = new int[arg2.length];
        this.field6193 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            this.field6192[var6] = arg2[var6].field4330;
            this.field6194[var6] = arg2[var6].field4329;
            this.field6193[var6] = arg2[var6].field4336;
        }
    }

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([B[IIIIIIII)V")
    private final void method2688(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!no", name = "a", descriptor = "([B[IIIIIIIIIIILkf;II)V")
    private final void method2689(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class152 arg12, int arg13, int arg14) {
        class129 var16 = (class129) arg12;
        int[] var17 = var16.field1894;
        int[] var18 = var16.field1897;
        int var19 = arg9 - this.field6195.field4842;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field6195.field4833;
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
}
