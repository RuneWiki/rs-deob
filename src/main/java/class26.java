import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!n")
public class class26 extends class13 {

    @OriginalMember(owner = "mapview!n", name = "G", descriptor = "I")
    public int field373;

    @OriginalMember(owner = "mapview!n", name = "H", descriptor = "I")
    public int field374;

    @OriginalMember(owner = "mapview!n", name = "I", descriptor = "I")
    public int field375;

    @OriginalMember(owner = "mapview!n", name = "K", descriptor = "I")
    public int field377;

    @OriginalMember(owner = "mapview!n", name = "L", descriptor = "I")
    public int field378;

    @OriginalMember(owner = "mapview!n", name = "N", descriptor = "I")
    public int field380;

    @OriginalMember(owner = "mapview!n", name = "M", descriptor = "[B")
    public byte[] field379;

    @OriginalMember(owner = "mapview!n", name = "J", descriptor = "[I")
    public int[] field376;

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([I[B[IIIIIIII)V", line = 17)
    private static final void method170(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "(II)V", line = 54)
    public final void method171(int arg0, int arg1) {
        int var3 = this.field375 + arg0;
        int var4 = this.field378 + arg1;
        int var5 = class13.field131 * var4 + var3;
        int var6 = 0;
        int var7 = this.field377;
        int var8 = this.field380;
        int var9 = class13.field131 - var8;
        int var10 = 0;
        if (var4 < class13.field130) {
            int var11 = class13.field130 - var4;
            var7 -= var11;
            var4 = class13.field130;
            var6 += var8 * var11;
            var5 += class13.field131 * var11;
        }
        if (var4 + var7 > class13.field132) {
            var7 -= var4 + var7 - class13.field132;
        }
        if (var3 < class13.field127) {
            int var12 = class13.field127 - var3;
            var8 -= var12;
            var3 = class13.field127;
            var6 += var12;
            var5 += var12;
            var10 += var12;
            var9 += var12;
        }
        if (var3 + var8 > class13.field128) {
            int var13 = var3 + var8 - class13.field128;
            var8 -= var13;
            var10 += var13;
            var9 += var13;
        }
        if (var8 > 0 && var7 > 0) {
            method173(class13.field126, this.field379, this.field376, 0, var6, var5, var8, var7, var9, var10);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "e", descriptor = "(IIII)V", line = 115)
    public final void method172(int arg0, int arg1, int arg2, int arg3) {
        int var5 = this.field380;
        int var6 = this.field377;
        int var7 = 0;
        int var8 = 0;
        int var9 = this.field373;
        int var10 = this.field374;
        int var11 = (var9 << 16) / arg2;
        int var12 = (var10 << 16) / arg3;
        if (this.field375 > 0) {
            int var13 = ((this.field375 << 16) + var11 - 1) / var11;
            arg0 += var13;
            var7 += var11 * var13 - (this.field375 << 16);
        }
        if (this.field378 > 0) {
            int var14 = ((this.field378 << 16) + var12 - 1) / var12;
            arg1 += var14;
            var8 += var12 * var14 - (this.field378 << 16);
        }
        if (var5 < var9) {
            arg2 = ((var5 << 16) + var11 - var7 - 1) / var11;
        }
        if (var6 < var10) {
            arg3 = ((var6 << 16) + var12 - var8 - 1) / var12;
        }
        int var15 = class13.field131 * arg1 + arg0;
        int var16 = class13.field131 - arg2;
        if (arg1 + arg3 > class13.field132) {
            arg3 -= arg1 + arg3 - class13.field132;
        }
        if (arg1 < class13.field130) {
            int var17 = class13.field130 - arg1;
            arg3 -= var17;
            var15 += class13.field131 * var17;
            var8 += var12 * var17;
        }
        if (arg0 + arg2 > class13.field128) {
            int var18 = arg0 + arg2 - class13.field128;
            arg2 -= var18;
            var16 += var18;
        }
        if (arg0 < class13.field127) {
            int var19 = class13.field127 - arg0;
            arg2 -= var19;
            var15 += var19;
            var7 += var11 * var19;
            var16 += var19;
        }
        method174(class13.field126, this.field379, this.field376, var7, var8, var15, var16, arg2, arg3, var11, var12, var5);
    }

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "([I[B[IIIIIIII)V", line = 190)
    private static final void method173(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
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

    @OriginalMember(owner = "mapview!n", name = "a", descriptor = "([I[B[IIIIIIIIII)V", line = 256)
    private static final void method174(int[] arg0, byte[] arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
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

    @OriginalMember(owner = "mapview!n", name = "b", descriptor = "(III)V", line = 299)
    public final void method175(int arg0, int arg1, int arg2) {
        int var4 = this.field375 + arg0;
        int var5 = this.field378 + arg1;
        int var6 = class13.field131 * var5 + var4;
        int var7 = 0;
        int var8 = this.field377;
        int var9 = this.field380;
        int var10 = class13.field131 - var9;
        int var11 = 0;
        if (var5 < class13.field130) {
            int var12 = class13.field130 - var5;
            var8 -= var12;
            var5 = class13.field130;
            var7 += var9 * var12;
            var6 += class13.field131 * var12;
        }
        if (var5 + var8 > class13.field132) {
            var8 -= var5 + var8 - class13.field132;
        }
        if (var4 < class13.field127) {
            int var13 = class13.field127 - var4;
            var9 -= var13;
            var4 = class13.field127;
            var7 += var13;
            var6 += var13;
            var11 += var13;
            var10 += var13;
        }
        if (var4 + var9 > class13.field128) {
            int var14 = var4 + var9 - class13.field128;
            var9 -= var14;
            var11 += var14;
            var10 += var14;
        }
        if (var9 > 0 && var8 > 0) {
            method170(class13.field126, this.field379, this.field376, var7, var6, var9, var8, var10, var11, arg2);
        }
    }

    @OriginalMember(owner = "mapview!n", name = "<init>", descriptor = "()V", line = 353)
    protected class26() {
    }
}
