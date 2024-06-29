import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class34 extends class22 {

    @OriginalMember(owner = "mapview!ra", name = "r", descriptor = "I")
    public int field467;

    @OriginalMember(owner = "mapview!ra", name = "s", descriptor = "I")
    public int field468;

    @OriginalMember(owner = "mapview!ra", name = "t", descriptor = "I")
    public int field469;

    @OriginalMember(owner = "mapview!ra", name = "u", descriptor = "I")
    public int field470;

    @OriginalMember(owner = "mapview!ra", name = "x", descriptor = "I")
    public int field473;

    @OriginalMember(owner = "mapview!ra", name = "y", descriptor = "I")
    public int field474;

    @OriginalMember(owner = "mapview!ra", name = "w", descriptor = "[B")
    public byte[] field472;

    @OriginalMember(owner = "mapview!ra", name = "v", descriptor = "[I")
    public int[] field471;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 13)
    private static final void method194(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 256 - arg9;
        for (int var11 = -arg6; var11 < 0; var11++) {
            for (int var12 = -arg5; var12 < 0; var12++) {
                byte var13 = arg1[arg3++];
                if (var13 == 0) {
                    arg4++;
                } else {
                    int var14 = arg2[var13 & 0xFF];
                    int var15 = arg0[arg4];
                    arg0[arg4++] = ((var14 & 0xFF00FF) * arg9 + (var15 & 0xFF00FF) * var10 & 0xFF00FF00) + ((var14 & 0xFF00) * arg9 + (var15 & 0xFF00) * var10 & 0xFF0000) >> 8;
                }
            }
            arg4 += arg7;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "(IIII)V", line = 55)
    public final void method195(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field474;
        int var6 = this.field467;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field468;
        int var10 = this.field473;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field469 > 0) {
            int var13 = ((this.field469 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field469 << 16);
        }
        if (this.field470 > 0) {
            int var14 = ((this.field470 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field470 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class22.field246 * arg1 + arg0;
        int var16 = class22.field246 - arg2;
        if (arg1 + arg3 > class22.field245) {
            arg3 -= arg1 + arg3 - class22.field245;
        }
        if (arg1 < class22.field247) {
            int var17 = class22.field247 - arg1;
            arg3 -= var17;
            var15 += class22.field246 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class22.field251) {
            int var18 = arg0 + arg2 - class22.field251;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class22.field248) {
            int var19 = class22.field248 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method197(class22.field249, this.field472, this.field471, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 133)
    private static final void method196(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = -(arg6 >> 2);
        int var11 = -(arg6 & 0x3);
        for (int var12 = -arg7; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                byte var14 = arg1[arg4++];
                if (var14 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var14 & 0xFF];
                }
                byte var15 = arg1[arg4++];
                if (var15 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var15 & 0xFF];
                }
                byte var16 = arg1[arg4++];
                if (var16 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var16 & 0xFF];
                }
                byte var17 = arg1[arg4++];
                if (var17 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var17 & 0xFF];
                }
            }
            for (int var18 = var11; var18 < 0; var18++) {
                byte var19 = arg1[arg4++];
                if (var19 == 0) {
                    arg5++;
                } else {
                    arg0[arg5++] = arg2[var19 & 0xFF];
                }
            }
            arg5 += arg8;
            arg4 += arg9;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 198)
    private static final void method197(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(II)V", line = 230)
    public final void method198(int arg0, int arg1) {
        int var3 = this.field469 + arg0;
        int var4 = this.field470 + arg1;
        int var5 = class22.field246 * var4 + var3;
        int var6 = 0;
        int var7 = this.field467;
        int var8 = this.field474;
        int var9 = class22.field246 - var8;
        int var10 = 0;
        if (var4 < class22.field247) {
            int var11 = class22.field247 - var4;
            var7 -= var11;
            var4 = class22.field247;
            var6 += var8 * var11;
            var5 += class22.field246 * var11;
        }
        if (var4 + var7 > class22.field245) {
            var7 -= var4 + var7 - class22.field245;
        }
        if (var3 < class22.field248) {
            int var12 = class22.field248 - var3;
            var8 -= var12;
            var3 = class22.field248;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class22.field251) {
            int var13 = var3 + var8 - class22.field251;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method196(class22.field249, this.field472, this.field471, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "(III)V", line = 293)
    public final void method199(int arg0, int arg1, int arg2) {
        int var4 = this.field469 + arg0;
        int var5 = this.field470 + arg1;
        int var6 = class22.field246 * var5 + var4;
        int var7 = 0;
        int var8 = this.field467;
        int var9 = this.field474;
        int var10 = class22.field246 - var9;
        int var11 = 0;
        if (var5 < class22.field247) {
            int var12 = class22.field247 - var5;
            var8 -= var12;
            var5 = class22.field247;
            var7 += var9 * var12;
            var6 += class22.field246 * var12;
        }
        if (var5 + var8 > class22.field245) {
            var8 -= var5 + var8 - class22.field245;
        }
        if (var4 < class22.field248) {
            int var13 = class22.field248 - var4;
            var9 -= var13;
            var4 = class22.field248;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class22.field251) {
            int var14 = var4 + var9 - class22.field251;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method194(class22.field249, this.field472, this.field471, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "<init>", descriptor = "()V", line = 350)
    protected class34() {
    }
}
