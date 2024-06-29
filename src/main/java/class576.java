import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!es")
public class class576 extends class262 {

    @OriginalMember(owner = "client!es", name = "x", descriptor = "Ljba;")
    private class647 field8029;

    @OriginalMember(owner = "client!es", name = "A", descriptor = "[I")
    private int[] field8032;

    @OriginalMember(owner = "client!es", name = "z", descriptor = "[I")
    private int[] field8031;

    @OriginalMember(owner = "client!es", name = "v", descriptor = "[[B")
    private byte[][] field8027;

    @OriginalMember(owner = "client!es", name = "w", descriptor = "[I")
    private int[] field8028;

    @OriginalMember(owner = "client!es", name = "y", descriptor = "[I")
    private int[] field8030;

    @OriginalMember(owner = "client!es", name = "HA", descriptor = "(CIIIZ)V")
    public final void method487(char arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int var6 = this.field8030[arg0] + arg1;
        int var7 = this.field8028[arg0] + arg2;
        int var8 = this.field8032[arg0];
        int var9 = this.field8031[arg0];
        int var10 = this.field8029.field9375;
        int var11 = var7 * var10 + var6;
        int var12 = var10 - var8;
        int var13 = 0;
        int var14 = 0;
        if (var7 < this.field8029.field9382) {
            int var15 = this.field8029.field9382 - var7;
            var9 -= var15;
            var7 = this.field8029.field9382;
            var14 += var8 * var15;
            var11 += var10 * var15;
        }
        if (var7 + var9 > this.field8029.field9385) {
            var9 -= var7 + var9 - this.field8029.field9385;
        }
        if (var6 < this.field8029.field9395) {
            int var16 = this.field8029.field9395 - var6;
            var8 -= var16;
            var6 = this.field8029.field9395;
            var14 += var16;
            var11 += var16;
            var13 += var16;
            var12 += var16;
        }
        if (var6 + var8 > this.field8029.field9380) {
            int var17 = var6 + var8 - this.field8029.field9380;
            var8 -= var17;
            var13 += var17;
            var12 += var17;
        }
        if (var8 > 0 && var9 > 0) {
            this.method3241(this.field8027[arg0], this.field8029.field9376, arg3, var14, var11, var8, var9, var12, var13);
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([B[IIIIIIII)V")
    private final void method3241(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
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

    @OriginalMember(owner = "client!es", name = "a", descriptor = "(CIIIZLpa;II)V")
    public final void method488(char arg0, int arg1, int arg2, int arg3, boolean arg4, class594 arg5, int arg6, int arg7) {
        if (arg5 == null) {
            this.method487(arg0, arg1, arg2, arg3, arg4);
            return;
        }
        int var9 = this.field8030[arg0] + arg1;
        int var10 = this.field8028[arg0] + arg2;
        int var11 = this.field8032[arg0];
        int var12 = this.field8031[arg0];
        int var13 = this.field8029.field9375;
        int var14 = var10 * var13 + var9;
        int var15 = var13 - var11;
        int var16 = 0;
        int var17 = 0;
        if (var10 < this.field8029.field9382) {
            int var18 = this.field8029.field9382 - var10;
            var12 -= var18;
            var10 = this.field8029.field9382;
            var17 += var11 * var18;
            var14 += var13 * var18;
        }
        if (var10 + var12 > this.field8029.field9385) {
            var12 -= var10 + var12 - this.field8029.field9385;
        }
        if (var9 < this.field8029.field9395) {
            int var19 = this.field8029.field9395 - var9;
            var11 -= var19;
            var9 = this.field8029.field9395;
            var17 += var19;
            var14 += var19;
            var16 += var19;
            var15 += var19;
        }
        if (var9 + var11 > this.field8029.field9380) {
            int var20 = var9 + var11 - this.field8029.field9380;
            var11 -= var20;
            var16 += var20;
            var15 += var20;
        }
        if (var11 > 0 && var12 > 0) {
            this.method3242(this.field8027[arg0], this.field8029.field9376, arg3, var17, var14, var11, var12, var15, var16, var9, var10, this.field8032[arg0], arg5, arg6, arg7);
        }
    }

    @OriginalMember(owner = "client!es", name = "<init>", descriptor = "(Ljba;Lpe;[Lig;[I[I)V")
    public class576(class647 arg0, class157 arg1, class295[] arg2, int[] arg3, int[] arg4) {
        super(arg0, arg1);
        this.field8029 = arg0;
        this.field8029 = arg0;
        this.field8032 = arg3;
        this.field8031 = arg4;
        this.field8027 = new byte[arg2.length][];
        this.field8028 = new int[arg2.length];
        this.field8030 = new int[arg2.length];
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class295 var7 = arg2[var6];
            if (var7.field3833 == null) {
                byte[] var8 = var7.field3831;
                byte[] var9 = this.field8027[var6] = new byte[var8.length];
                for (int var10 = 0; var10 < var8.length; var10++) {
                    var9[var10] = (byte) (var8[var10] == 0 ? 0 : -1);
                }
            } else {
                this.field8027[var6] = var7.field3833;
            }
            this.field8028[var6] = var7.field3832;
            this.field8030[var6] = var7.field3830;
        }
    }

    @OriginalMember(owner = "client!es", name = "a", descriptor = "([B[IIIIIIIIIIILpa;II)V")
    private final void method3242(byte[] arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class594 arg12, int arg13, int arg14) {
        class395 var16 = (class395) arg12;
        int[] var17 = var16.field5458;
        int[] var18 = var16.field5456;
        int var19 = arg9 - this.field8029.field9395;
        int var20 = arg10;
        if (arg14 > arg10) {
            var20 = arg14;
            arg4 += (arg14 - arg10) * this.field8029.field9375;
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
