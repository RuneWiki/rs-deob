import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!u")
public class class38 extends class2 {

    @OriginalMember(owner = "mapview!u", name = "x", descriptor = "I")
    public int field490;

    @OriginalMember(owner = "mapview!u", name = "y", descriptor = "I")
    public int field491;

    @OriginalMember(owner = "mapview!u", name = "A", descriptor = "I")
    public int field493;

    @OriginalMember(owner = "mapview!u", name = "B", descriptor = "I")
    public int field494;

    @OriginalMember(owner = "mapview!u", name = "C", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "mapview!u", name = "D", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "mapview!u", name = "z", descriptor = "[B")
    public byte[] field492;

    @OriginalMember(owner = "mapview!u", name = "E", descriptor = "[I")
    public int[] field497;

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 9)
    private static final void method230(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(II)V", line = 73)
    public final void method231(int arg0, int arg1) {
        int var3 = this.field493 + arg0;
        int var4 = this.field490 + arg1;
        int var5 = class2.field45 * var4 + var3;
        int var6 = 0;
        int var7 = this.field495;
        int var8 = this.field494;
        int var9 = class2.field45 - var8;
        int var10 = 0;
        if (var4 < class2.field44) {
            int var11 = class2.field44 - var4;
            var7 -= var11;
            var4 = class2.field44;
            var6 += var8 * var11;
            var5 += class2.field45 * var11;
        }
        if (var4 + var7 > class2.field43) {
            var7 -= var4 + var7 - class2.field43;
        }
        if (var3 < class2.field42) {
            int var12 = class2.field42 - var3;
            var8 -= var12;
            var3 = class2.field42;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class2.field46) {
            int var13 = var3 + var8 - class2.field46;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method230(class2.field48, this.field492, this.field497, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 134)
    private static final void method232(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "(III)V", line = 181)
    public final void method233(int arg0, int arg1, int arg2) {
        int var4 = this.field493 + arg0;
        int var5 = this.field490 + arg1;
        int var6 = class2.field45 * var5 + var4;
        int var7 = 0;
        int var8 = this.field495;
        int var9 = this.field494;
        int var10 = class2.field45 - var9;
        int var11 = 0;
        if (var5 < class2.field44) {
            int var12 = class2.field44 - var5;
            var8 -= var12;
            var5 = class2.field44;
            var7 += var9 * var12;
            var6 += class2.field45 * var12;
        }
        if (var5 + var8 > class2.field43) {
            var8 -= var5 + var8 - class2.field43;
        }
        if (var4 < class2.field42) {
            int var13 = class2.field42 - var4;
            var9 -= var13;
            var4 = class2.field42;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class2.field46) {
            int var14 = var4 + var9 - class2.field46;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method234(class2.field48, this.field492, this.field497, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "mapview!u", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 240)
    private static final void method234(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!u", name = "e", descriptor = "(IIII)V", line = 276)
    public final void method235(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field494;
        int var6 = this.field495;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field491;
        int var10 = this.field496;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field493 > 0) {
            int var13 = ((this.field493 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field493 << 16);
        }
        if (this.field490 > 0) {
            int var14 = ((this.field490 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field490 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class2.field45 * arg1 + arg0;
        int var16 = class2.field45 - arg2;
        if (arg1 + arg3 > class2.field43) {
            arg3 -= arg1 + arg3 - class2.field43;
        }
        if (arg1 < class2.field44) {
            int var17 = class2.field44 - arg1;
            arg3 -= var17;
            var15 += class2.field45 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class2.field46) {
            int var18 = arg0 + arg2 - class2.field46;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class2.field42) {
            int var19 = class2.field42 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method232(class2.field48, this.field492, this.field497, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!u", name = "<init>", descriptor = "()V", line = 352)
    protected class38() {
    }
}
