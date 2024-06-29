import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!m")
public class class24 extends class27 {

    @OriginalMember(owner = "mapview!m", name = "D", descriptor = "I")
    public int field278;

    @OriginalMember(owner = "mapview!m", name = "F", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "mapview!m", name = "M", descriptor = "I")
    public int field280;

    @OriginalMember(owner = "mapview!m", name = "N", descriptor = "I")
    public int field281;

    @OriginalMember(owner = "mapview!m", name = "O", descriptor = "I")
    public int field282;

    @OriginalMember(owner = "mapview!m", name = "Q", descriptor = "I")
    public int field284;

    @OriginalMember(owner = "mapview!m", name = "P", descriptor = "[B")
    public byte[] field283;

    @OriginalMember(owner = "mapview!m", name = "R", descriptor = "[I")
    public int[] field285;

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([I[B[IIIIIII)V", line = 5)
    private static final void method172(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = var9; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var13 & 0xFF];
                }
                byte var14 = arg1[arg3++];
                if (var14 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg3++];
                if (var15 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg3++];
                if (var16 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var16 & 0xFF];
                }
            }
            for (int var17 = var10; var17 < 0; var17++) {
                byte var18 = arg1[arg3++];
                if (var18 == 0) {
                    arg4++;
                } else {
                    arg0[arg4++] = arg2[var18 & 0xFF];
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 68)
    private static final void method173(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!m", name = "e", descriptor = "(IIII)V", line = 104)
    public final void method174(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field278;
        int var6 = this.field281;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field284;
        int var10 = this.field280;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field279 > 0) {
            int var13 = ((this.field279 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field279 << 16);
        }
        if (this.field282 > 0) {
            int var14 = ((this.field282 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field282 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class27.field397 * arg1 + arg0;
        int var16 = class27.field397 - arg2;
        if (arg1 + arg3 > class27.field398) {
            arg3 -= arg1 + arg3 - class27.field398;
        }
        if (arg1 < class27.field402) {
            int var17 = class27.field402 - arg1;
            arg3 -= var17;
            var15 += class27.field397 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class27.field400) {
            int var18 = arg0 + arg2 - class27.field400;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class27.field401) {
            int var19 = class27.field401 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method173(class27.field399, this.field283, this.field285, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!m", name = "a", descriptor = "(II)V", line = 192)
    public final void method175(int arg0, int arg1) {
        int var3 = this.field279 + arg0;
        int var4 = this.field282 + arg1;
        int var5 = class27.field397 * var4 + var3;
        int var6 = 0;
        int var7 = this.field281;
        int var8 = this.field278;
        int var9 = class27.field397 - var8;
        int var10 = 0;
        if (var4 < class27.field402) {
            int var11 = class27.field402 - var4;
            var7 -= var11;
            var4 = class27.field402;
            var6 += var8 * var11;
            var5 += class27.field397 * var11;
        }
        if (var4 + var7 > class27.field398) {
            var7 -= var4 + var7 - class27.field398;
        }
        if (var3 < class27.field401) {
            int var12 = class27.field401 - var3;
            var8 -= var12;
            var3 = class27.field401;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class27.field400) {
            int var13 = var3 + var8 - class27.field400;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method172(class27.field399, this.field283, this.field285, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!m", name = "<init>", descriptor = "()V", line = 261)
    protected class24() {
    }
}
