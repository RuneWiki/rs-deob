import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class46 extends class395 {

    @OriginalMember(owner = "client!lu", name = "A", descriptor = "Lve;")
    private class578 field620;

    @OriginalMember(owner = "client!lu", name = "C", descriptor = "[I")
    private int[] field621;

    @OriginalMember(owner = "client!lu", name = "y", descriptor = "[I")
    private int[] field618;

    @OriginalMember(owner = "client!lu", name = "x", descriptor = "[[B")
    private byte[][] field617;

    @OriginalMember(owner = "client!lu", name = "w", descriptor = "[I")
    private int[] field616;

    @OriginalMember(owner = "client!lu", name = "z", descriptor = "[I")
    private int[] field619;

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(Lve;Lll;[Lfda;[I[I)V")
    public class46(class578 arg0, class490 arg1, class628[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field620 = arg0;
        this.field620 = arg0;
        this.field621 = arg3;
        this.field618 = arg4;
        this.field617 = new byte[arg2.length][];
        this.field616 = new int[arg2.length];
        this.field619 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class628 var7 = arg2[var6];
            if (var7.field8934 == null) {
                byte[] var8 = var7.field8939;
                byte[] var9 = this.field617[var6] = new byte[var8.length];
                for (int var10 = 0; var10 < var8.length; var10++) {
                    var9[var10] = (byte) (var8[var10] == 0 ? 0 : -1);
                }
            } else {
                this.field617[var6] = var7.field8934;
            }
            this.field616[var6] = var7.field8935;
            this.field619[var6] = var7.field8933;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(CIIIZLua;II)V")
    public final void method366(char arg0, int arg1, int arg2, int arg3, boolean arg4, class591 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method368(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field619[arg0] + arg1;
        int var10 = this.field616[arg0] + arg2;
        int var11 = this.field621[arg0];
        int var12 = this.field618[arg0];
        int var13 = this.field620.field8485;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field620.field8467) {
            int var18 = this.field620.field8467 - var10;
            var12 -= var18;
            var10 = this.field620.field8467;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field620.field8495) {
            var12 -= var10 + var12 - this.field620.field8495;
        }
        if (var9 < this.field620.field8489) {
            int var19 = this.field620.field8489 - var9;
            var11 -= var19;
            var9 = this.field620.field8489;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field620.field8474) {
            int var20 = var9 + var11 - this.field620.field8474;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method369(this.field617[arg0], this.field620.field8466, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field621[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([B[IIIIIIII)V")
    private final void method367(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!lu", name = "OA", descriptor = "(CIIIZ)V")
    public final void method368(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field619[arg0] + arg1;
        int var7 = this.field616[arg0] + arg2;
        int var8 = this.field621[arg0];
        int var9 = this.field618[arg0];
        int var10 = this.field620.field8485;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field620.field8467) {
            int var15 = this.field620.field8467 - var7;
            var9 -= var15;
            var7 = this.field620.field8467;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field620.field8495) {
            var9 -= var7 + var9 - this.field620.field8495;
        }
        if (var6 < this.field620.field8489) {
            int var16 = this.field620.field8489 - var6;
            var8 -= var16;
            var6 = this.field620.field8489;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field620.field8474) {
            int var17 = var6 + var8 - this.field620.field8474;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method367(this.field617[arg0], this.field620.field8466, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "([B[IIIIIIIIIIILua;II)V")
    private final void method369(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class591 arg12, int arg13, int arg14) {
        class184 var16 = (class184) arg12;
        int[] var17 = var16.field2917;
        int[] var18 = var16.field2919;
        int var19 = arg9 - this.field620.field8489;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field620.field8485;
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
