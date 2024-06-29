import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ba")
public class class5 extends class39 {

    @OriginalMember(owner = "mapview!ba", name = "r", descriptor = "[B")
    private byte[] field73;

    @OriginalMember(owner = "mapview!ba", name = "q", descriptor = "[I")
    private int[] field72;

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 9)
    private static final void method39(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; ++var11) {
            for (int var12 = -arg5; var12 < 0; ++var12) {
                byte var13 = arg1[arg3++];
                if (var13 != 0) {
                    int var14 = arg2[var13 & 255];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 16711935) * arg9 + (var15 & 16711935) * var10 & -16711936) + ((var14 & 65280) * arg9 + (var15 & 65280) * var10 & 16711680) >> 8;
                } else {
                    ++arg4;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(IIII)V", line = 43)
    public final void method40(int arg0, int arg1, int arg2, int arg3) {
        int var5 = super.field476;
        int var6 = super.field487;
        int var7 = 0;
        int var8 = 0;
        int var9 = super.field480;
        int var10 = super.field477;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (super.field481 > 0) {
            int var13 = ((super.field481 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (super.field481 << 16);
        }
        if (super.field485 > 0) {
            int var14 = ((super.field485 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (super.field485 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) - var7 + var11 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) - var8 + var12 - 1) / var12;
        }
        int var15 = class12.field118 * arg1 + arg0;
        int var16 = class12.field118 - arg2;
        if (arg1 + arg3 > class12.field119) {
            arg3 -= arg1 + arg3 - class12.field119;
        }
        if (arg1 < class12.field117) {
            int var17 = class12.field117 - arg1;
            arg3 -= var17;
            var15 += class12.field118 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class12.field120) {
            int var18 = arg0 + arg2 - class12.field120;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class12.field114) {
            int var19 = class12.field114 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method43(class12.field115, this.field73, this.field72, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!ba", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 132)
    private static final void method41(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 3);
        for (int var12 = -arg7; var12 < 0; ++var12) {
            for (int var13 = var10; var13 < 0; ++var13) {
                byte var14 = arg1[arg4++];
                if (var14 != 0) {
                    arg0[arg5++] = arg2[var14 & 255];
                } else {
                    ++arg5;
                }
                byte var15 = arg1[arg4++];
                if (var15 != 0) {
                    arg0[arg5++] = arg2[var15 & 255];
                } else {
                    ++arg5;
                }
                byte var16 = arg1[arg4++];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
                } else {
                    ++arg5;
                }
                byte var17 = arg1[arg4++];
                if (var17 != 0) {
                    arg0[arg5++] = arg2[var17 & 255];
                } else {
                    ++arg5;
                }
            }
            for (int var18 = var11; var18 < 0; ++var18) {
                byte var19 = arg1[arg4++];
                if (var19 != 0) {
                    arg0[arg5++] = arg2[var19 & 255];
                } else {
                    ++arg5;
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "<init>", descriptor = "(IIIIII[B[I)V", line = 193)
    public class5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7) {
        super.field480 = arg0;
        super.field477 = arg1;
        super.field481 = arg2;
        super.field485 = arg3;
        super.field476 = arg4;
        super.field487 = arg5;
        this.field73 = arg6;
        this.field72 = arg7;
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(II)V", line = 207)
    public final void method42(int arg0, int arg1) {
        int var3 = super.field481 + arg0;
        int var4 = super.field485 + arg1;
        int var5 = class12.field118 * var4 + var3;
        int var6 = 0;
        int var7 = super.field487;
        int var8 = super.field476;
        int var9 = class12.field118 - var8;
        int var10 = 0;
        if (var4 < class12.field117) {
            int var11 = class12.field117 - var4;
            var7 -= var11;
            var4 = class12.field117;
            var6 += var8 * var11;
            var5 += class12.field118 * var11;
        }
        if (var4 + var7 > class12.field119) {
            var7 -= var4 + var7 - class12.field119;
        }
        if (var3 < class12.field114) {
            int var12 = class12.field114 - var3;
            var8 -= var12;
            var3 = class12.field114;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class12.field120) {
            int var13 = var3 + var8 - class12.field120;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method41(class12.field115, this.field73, this.field72, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 266)
    private static final void method43(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        int var12 = arg3;
        for (int var13 = -arg8; var13 < 0; ++var13) {
            int var14 = (arg4 >> 16) * arg11;
            for (int var15 = -arg7; var15 < 0; ++var15) {
                byte var16 = arg1[(arg3 >> 16) + var14];
                if (var16 != 0) {
                    arg0[arg5++] = arg2[var16 & 255];
                } else {
                    ++arg5;
                }
                arg3 += arg9;
            }
            arg4 += arg10;
            arg3 = var12;
            arg5 += arg6;
        }
    }

    @OriginalMember(owner = "mapview!ba", name = "a", descriptor = "(III)V", line = 299)
    public final void method44(int arg0, int arg1, int arg2) {
        int var4 = super.field481 + arg0;
        int var5 = super.field485 + arg1;
        int var6 = class12.field118 * var5 + var4;
        int var7 = 0;
        int var8 = super.field487;
        int var9 = super.field476;
        int var10 = class12.field118 - var9;
        int var11 = 0;
        if (var5 < class12.field117) {
            int var12 = class12.field117 - var5;
            var8 -= var12;
            var5 = class12.field117;
            var7 += var9 * var12;
            var6 += class12.field118 * var12;
        }
        if (var5 + var8 > class12.field119) {
            var8 -= var5 + var8 - class12.field119;
        }
        if (var4 < class12.field114) {
            int var13 = class12.field114 - var4;
            var9 -= var13;
            var4 = class12.field114;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class12.field120) {
            int var14 = var4 + var9 - class12.field120;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method39(class12.field115, this.field73, this.field72, var7, var6, var9, var8, var10, var11, arg2);
        }
    }
}
